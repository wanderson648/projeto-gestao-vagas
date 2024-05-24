package com.wo.gestao_vagas.modules.candidate.useCases;

import com.wo.gestao_vagas.modules.company.entities.JobEntity;
import com.wo.gestao_vagas.modules.company.repositories.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListAllJobsByFilterUseCase {

    private final JobRepository jobRepository;
    public List<JobEntity> execute(String filter) {
        return jobRepository.findByDescriptionContaining(filter);
    }
}

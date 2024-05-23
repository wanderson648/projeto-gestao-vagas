package com.wo.gestao_vagas.modules.company.useCases;

import com.wo.gestao_vagas.modules.company.entities.JobEntity;
import com.wo.gestao_vagas.modules.company.repositories.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateJobUseCase {

    private final JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity) {
       return jobRepository.save(jobEntity);
    }
}

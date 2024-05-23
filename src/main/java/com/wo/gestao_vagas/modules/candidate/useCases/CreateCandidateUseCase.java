package com.wo.gestao_vagas.modules.candidate.useCases;

import com.wo.gestao_vagas.exceptions.UserFoundException;
import com.wo.gestao_vagas.modules.candidate.entities.CandidateEntity;
import com.wo.gestao_vagas.modules.candidate.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCandidateUseCase {

    private final CandidateRepository candidateRepository;

    public CandidateEntity execute(CandidateEntity candidateEntity) {
        candidateRepository.findByUsernameOrEmail(
                        candidateEntity.getUsername(), candidateEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });

        return candidateRepository.save(candidateEntity);
    }

}

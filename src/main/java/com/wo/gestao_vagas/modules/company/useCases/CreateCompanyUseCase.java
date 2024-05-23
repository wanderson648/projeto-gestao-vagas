package com.wo.gestao_vagas.modules.company.useCases;

import com.wo.gestao_vagas.exceptions.UserFoundException;
import com.wo.gestao_vagas.modules.company.repositories.CompanyRepository;
import com.wo.gestao_vagas.modules.company.entities.CompanyEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCompanyUseCase {

    private final CompanyRepository companyRepository;
    private final PasswordEncoder passwordEncoder;

    public CompanyEntity execute(CompanyEntity companyEntity) {
        companyRepository.findByUsernameOrEmail(
                        companyEntity.getUsername(), companyEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });

        var password = passwordEncoder.encode(companyEntity.getPassword());
        companyEntity.setPassword(password);

        return companyRepository.save(companyEntity);
    }
}

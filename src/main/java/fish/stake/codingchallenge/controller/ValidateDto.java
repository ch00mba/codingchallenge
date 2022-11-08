package fish.stake.codingchallenge.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ValidateDto {
    private final boolean validIpV4;
}

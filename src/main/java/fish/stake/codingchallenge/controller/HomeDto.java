package fish.stake.codingchallenge.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@RequiredArgsConstructor
@Getter
public class HomeDto {
    private final String version;
    private final long date;
    private final boolean kubernetes;
}

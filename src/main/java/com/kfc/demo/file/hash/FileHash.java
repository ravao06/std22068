package com.kfc.demo.file.hash;

import com.kfc.demo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}

import forcomp.Anagrams.{dictionary, dictionaryByOccurrences, wordOccurrences}

dictionary.groupBy(o => wordOccurrences(o))
dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1))).map(_.toSet)
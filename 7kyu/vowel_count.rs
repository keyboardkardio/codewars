fn get_count(string: &str) -> usize {
    let mut vowels_count: usize = 0;
    let chars: Vec<char> = string.chars().collect();
    for char in chars {
        if char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u' {
            vowels_count += 1;
        }
    }

    return vowels_count;
}


fn solution(s: &str) -> String {
    s.chars()
        .into_iter()
        .map(|c| {
            if c.is_uppercase() {
                format!(" {}", c)
            } else {
                c.to_string()
            }
        })
        .collect::<String>()
}


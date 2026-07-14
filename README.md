
# Font Vault

Sistema de armazenamento e gerenciamento de fontes favoritas, com upload, categorização e organização pessoal de arquivos de fonte (TTF, OTF, WOFF, WOFF2).

## 🚀 Stack

- **Backend:** Java + Spring Boot (MVC, JPA, Flyway)
- **Frontend:** React + TypeScript
- **Empacotamento:** Tauri
- **Banco de dados:** PostgreSQL (Supabase)
- **Storage:** Supabase Storage
- **Autenticação:** JWT

## 📁 Estrutura do projeto

```
font-vault/
├── backend/          # API Spring Boot (Java, Flyway, JPA)
├── frontend/         # Interface React + TypeScript
├── src-tauri/         # Configuração do Tauri
├── docs/              # Diagramas e decisões de arquitetura
└── README.md
```

## ✨ Funcionalidades (planejadas)

- [ ] Cadastro e login de usuário
- [ ] Upload de fontes (TTF, OTF, WOFF, WOFF2)
- [ ] Categorização de fontes (Serif, Sans Serif, Display, Handwriting, Monospace, Script)
- [ ] Listagem e busca de fontes por categoria
- [ ] Preview de fontes
- [ ] Edição de metadados (foundry, licença, descrição)
- [ ] Exclusão de fontes

## 🗄️ Modelo de dados

- `users` — usuários da aplicação
- `categories` — categorias de fontes (seed inicial já incluso)
- `fonts` — fontes cadastradas por usuário
- `font_category` — relação N:N entre fontes e categorias

## 🔧 Como rodar (em construção)

Instruções de setup do backend, frontend e build via Tauri serão adicionadas conforme o projeto evolui.

## 📌 Status

🚧 Projeto em desenvolvimento inicial.

---

Desenvolvido por **Pedro Rios**
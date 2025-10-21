import { useState } from "react";
import { Eye, EyeOff } from "lucide-react";

export default function Login() {
  const [showPassword, setShowPassword] = useState(false);

  return (
    <div className="flex flex-col items-center justify-center min-h-screen bg-white">
      {/* Logo */}
      <div
        className="w-40 h-40 rounded-full shadow-md mb-6"
        style={{
          background: "url('/Logo_profissional_loja_de_semijoias_moderno_preto__8_-removebg-preview.png') no-repeat center",
          backgroundSize: "cover",
        }}
      ></div>

      {/* Form */}
      <div className="w-80 p-6 bg-white/80 rounded-2xl shadow-lg flex flex-col space-y-4">
        {/* Input Login */}
        <input
          type="text"
          placeholder="Login"
          className="w-full px-4 py-2 border rounded-full focus:outline-none focus:ring-2 focus:ring-black"
        />

        {/* Input Senha com ícone */}
        <div className="relative w-full">
          <input
            type={showPassword ? "text" : "password"}
            placeholder="Senha"
            className="w-full px-4 py-2 border rounded-full focus:outline-none focus:ring-2 focus:ring-black"
          />
          <button
            type="button"
            onClick={() => setShowPassword(!showPassword)}
            className="absolute right-3 top-2 text-gray-600"
          >
            {showPassword ? <EyeOff size={20} /> : <Eye size={20} />}
          </button>
        </div>

        {/* Link Esqueci Senha */}
        <button className="text-sm text-gray-600 hover:underline self-start">
          Esqueci senha
        </button>

        {/* Botão Entrar */}
        <button className="w-full py-2 bg-black text-white font-semibold rounded-full shadow-md hover:bg-gray-800 transition">
          Entrar
        </button>
      </div>
    </div>
  );
}

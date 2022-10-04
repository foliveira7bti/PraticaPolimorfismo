import java.util.ArrayList;

public class EmpresaView {

	public static void main(String[] args) {
		
		ArrayList listaFuncionarios = new ArrayList<Funcionario>();
		
		Funcionario f = new Funcionario();
		f.setTipoFuncionario("Engenheiro");
		f.setSalario(4500.50);
		f.calcularSalario();
		
		Vendedor v = new Vendedor();
		v.setTipoFuncionario("Vendedor");
		v.setSalario(1500.00);
		v.setComissao(500.00);
		v.calcularSalario();
		
		Gerente g = new Gerente();
		g.setTipoFuncionario("Gerente");;
		g.setSalario(7500.00);
		g.setBonus(2000.00);
		g.calcularSalario();
		
		System.out.println("Salario " + f.getClass() + " R$ " + f.getSalario());
		System.out.println("Salario " + v.getClass() + " R$ " + v.getSalario());
		System.out.println("Salario " + g.getClass() + " R$ " + g.getSalario());
		
		Vendedor v2 = new Vendedor();
		v.setTipoFuncionario("Vendedor 2");
		v.setSalario(3500.00);
		v.setComissao(100.00);
		v.calcularSalario();
		
		listaFuncionarios.add(v);
		listaFuncionarios.add(v2);
		listaFuncionarios.add(g);
		listaFuncionarios.add(f);
		
		System.out.println("Aumento de salarios. Todos os funcionarios: +500.00R$, Vendedores recebem um aumento adicional de 800.00R$ ");
		

	}

}

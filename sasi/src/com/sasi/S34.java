
//Credit Score
//Monthly Income
//Employment Years
//Age
//Marital Status
//Number of Dependents
//PAN Card Available
//Aadhar Available
//Existing Loans
//EMI to Income Ratio
//Criminal Record
//CIBIL Report Status
//Type of Job (Govt/Private/Other)
//Property Ownership
//Location (Urban/Rural
package com.sasi;
import java.util.Scanner;
public class S34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Loan App");

		System.out.print("Enter credit score category (high/low): ");
		String creditScore = sc.nextLine();

		switch (creditScore.toLowerCase()) {
		case "high":
			System.out.print("Enter yearly income category (high/low): ");
			String income = sc.nextLine();

			switch (income.toLowerCase()) {
			case "high":
				System.out.print("Enter employment experience (more/less): ");
				String exp = sc.nextLine();

				switch (exp.toLowerCase()) {
				case "more":
					System.out.print("Enter age category (adult/minor): ");
					String age = sc.nextLine();

					switch (age.toLowerCase()) {
					case "adult":
						System.out.print("Are you married? (yes/no): ");
						String married = sc.nextLine();

						switch (married.toLowerCase()) {
						case "no":
							System.out.print("Number of surities (one/more/none): ");
							String surity = sc.nextLine();

							switch (surity.toLowerCase()) {
							case "one":
							case "more":
								System.out.print("PAN card available? (yes/no): ");
								String pan = sc.nextLine();

								switch (pan.toLowerCase()) {
								case "yes":
									System.out.print("Aadhar card available? (yes/no): ");
									String aadhar = sc.nextLine();

									switch (aadhar.toLowerCase()) {
									case "yes":
										System.out.print("Existing loan? (yes/no): ");
										String existingLoan = sc.nextLine();

										switch (existingLoan.toLowerCase()) {
										case "no":
											System.out.print("Criminal records? (yes/no): ");
											String crime = sc.nextLine();

											switch (crime.toLowerCase()) {
											case "no":
												System.out.print("Job type (gov/pri/others): ");
												String job = sc.nextLine();

												switch (job.toLowerCase()) {
												case "gov":
												case "pri":
												case "others":
													System.out.print("Property ownership (self/none): ");
													String ownership = sc.nextLine();

													switch (ownership.toLowerCase()) {
													case "self":
														System.out.print("Location (urban/rural): ");
														String location = sc.nextLine();

														switch (location.toLowerCase()) {
														case "urban":
														case "rural":
															System.out.println("✅ Congrats! Your loan is approved.");
															break;
														default:
															System.out.println("❌ Invalid location.");
														}
														break;
													default:
														System.out.println("❌ Property ownership required.");
													}
													break;
												default:
													System.out.println("❌ Invalid job type.");
												}
												break;
											default:
												System.out.println("❌ Criminal records found.");
											}
											break;
										default:
											System.out.println("❌ Existing loan detected.");
										}
										break;
									default:
										System.out.println("❌ Aadhar card required.");
									}
									break;
								default:
									System.out.println("❌ PAN card required.");
								}
								break;
							default:
								System.out.println("❌ At least one surity is required.");
							}
							break;
						default:
							System.out.println("❌ Married applicants are not eligible.");
						}
						break;
					default:
						System.out.println("❌ Age should be above 21.");
					}
					break;
				default:
					System.out.println("❌ Experience must be more than 2 years.");
				}
				break;
			default:
				System.out.println("❌ Income must be greater than ₹4,00,000.");
			}
			break;

		default:
			System.out.println("❌ Credit score too low.");
		}

		sc.close();
	}
}

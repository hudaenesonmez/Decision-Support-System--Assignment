# Decision Support System - Assignment

This course is designed to teach employees and managers analytical thinking, accelerate the decision-making process, solve problems permanently, and make managerial decisions correctly.

The decision environment is related to the level of information the decision-maker has about the decision problem. Especially, the level of information about environmental factors is crucial in determining what the decision environment is. Decisions are restricted as follows, depending on the environment:

- Decision under Certainty
- Decision under Uncertainty
- Decision under Risk

**Decision under Uncertainty**

Uncertainty is a situation where the decision-maker does not have any probability value for the occurrence of natural states. If the decision-making process is carried out without having any probability value for the occurrence of natural states, the decision-making process is called decision-making under uncertainty. The criteria used in this assignment include decision-making criteria in uncertain environments.

1. **Optimism Criterion**
   In the optimism criterion approach, the decision-maker assumes that whichever decision alternative he chooses, he will obtain the highest profit (or the lowest cost) value for each decision alternative in the strategy matrix rows.

2. **Pessimism Criterion**
   In the pessimism criterion approach, the decision-maker assumes that whichever decision alternative he chooses, he will obtain the lowest profit value or will incur the highest cost value for each decision alternative in the strategy matrix rows.

3. **Hurwicz Criterion**
   Hurwicz has proposed a criterion that allows decision-makers to use optimism and pessimism criteria together to be more flexible in nature of the decision problem and the psychological condition of the decision-maker. In this criterion, called the compromise criterion, there is a coefficient that determines the optimism level of the decision-maker. The decision-maker's optimism level is denoted by "a," and it is assumed that "a" takes values ​​in the range of 0 to 1. When "a" is equal to 1, the decision-maker is optimistic, and when it is equal to 0, the decision-maker is pessimistic.

4. **Equally Likely Criterion (Laplace)**
   The Equally Likely (Laplace) Criterion represents an approach where each probability is considered equal in the decision-making process. This method assumes that the decision-maker equally values ​​all possible outcomes and assumes that each alternative has an equal chance. Therefore, when selecting different alternatives, it considers the probability of each alternative equally.

This project, prepared based on this information, learns whether the decision problem is "an income problem" or "a cost problem" with the information received from the user. Then, for the strategy matrix, it receives the number of Natural States, Decision Alternatives, the Hurwicz value received from the user, and then values ​​for each cell.
The prepared functions return the strategy matrix consisting of the values ​​given by the user, and depending on the problem type, it is evaluated through 4 criteria and shared with the user. Since Laplace Criterion and Hurwicz Criterion are decimal operations, they are more complex criteria than other criteria. There is a "Test Matrix" in the source code for the purpose of checking the correctness of these two criteria. The Test Matrix is ​​kept as comment lines. When turned from a comment line to a normal code line, it is activated and returns matrices on which operations are applied to test the correctness of these two criteria and shows their values.

This project was developed using the IntelliJ IDEA IDE.
To execute the Decision Support System, simply clone this repository, compile the Java files, and run the main class. Ensure Java is installed on your machine.

package Engine;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

/**
 * @author OmarEl-Mohandes
 *
 */
public interface Judge {

    /**
     * 
     * @return : All the problems texts 
     * @throws Exception 
     */
    public ArrayList<ProblemText> getProblemTexts()throws Exception;
    /**
     * 
     * @param username : Username of the coder.
     * @param password : Password of the coder.
     * @return int : <b>1<b> if signed in successfully , <b>0<b> if not signed in , <b>-1<b> if the operation didn't completed yet.
     */
    public int signIn(String username, String password) throws Exception;

    /**
     * 
     * @param username : Username of the coder.
     * @return <b>True<b> if signed in successfully , <b>False<b> if not.
     */
    public boolean signOut(String username);

    /**
     * 
     * @param coderId :  The ID of the coder.
     * @param password : The password of the coder.
     * @param problemId :The ID of the problem .
     * @param language : The ID of the language in this online judge.
     * @param code :     The submitted code.
     * @throws IOException
     * @throws Exception 
     */
    public Long submitProblem(String coderId, String password, String problemId, String languageId, String code) throws IOException, Exception;

    /**
     * @param coderId : The ID of the coder.
     * @param password : The password of the user.
     * @param submissionId: The submission id.
     * @return Instance of type Submission of the last submitted problem.
     * @throws Exception
     */
    public Submission getLastSubmission(String coderId, String password , String submissionId) throws Exception;

    /**
     *
     * @return All the problems on the online judge , instances of type Problem.
     * @throws Exception
     */
    public ArrayList<Problem> getAllProblems() throws Exception;

    /**
     *
     * @param codeId : The coder ID.
     * @return All the problems solved by this coder.
     * @throws Exception
     */
    public ArrayList<String> getProblemsSolved(String coderId) throws MalformedURLException, Exception;

    /**
     *
     * @param problemId : The problem ID.
     * @return Instance of type Problem.
     * @throws Exception
     */
    public Problem getProblemInfo(String problemId) throws Exception;
}

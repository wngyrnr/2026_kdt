-- "모든 부서의 부서명과, 해당 부서에서 가장 먼저 입사한(최고참) 사원의 이름과 입사일을 조회해 줘."

-- (단, 현재 사원이 한 명도 없는 신생 부서도 결과에 포함해야 하고, 퇴사한 직원은 제외할 것) 

-- 이라는 요건을 받고 아래와 같이 쿼리를 작성했습니다.



-- [작성된 코드]

select D.dept_title, F.emp_name, F.hire_date
from DEPARTMENT D
left join (select dept_code, min(hire_date) as first_date
			from employee
			where ent_yn = 'n'
			group by dept_code
			 )F
			 
		on D.dept_id = F.dept_code
		left join emplyee E
		on E.dept_id = f.dept_code
		and D.hire_date = f.first_date
		where E.`ENT_YN`='n'
		
		
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 -- -----------------------------


 SELECT D.DEPT_TITLE,
       E.EMP_NAME,
       E.HIRE_DATE
FROM DEPARTMENT D
LEFT JOIN (
    SELECT DEPT_CODE,
           MIN(HIRE_DATE) AS FIRST_HIRE
    FROM EMPLOYEE
    WHERE ENT_YN = 'N'
    GROUP BY DEPT_CODE
) F
ON D.DEPT_ID = F.DEPT_CODE
LEFT JOIN EMPLOYEE E
ON E.DEPT_CODE = F.DEPT_CODE
AND E.HIRE_DATE = F.FIRST_HIRE
AND E.ENT_YN = 'N';



-- "모든 부서의 부서명과, 해당 부서에서 가장 먼저 입사한(최고참) 사원의 이름과 입사일을 조회해 줘."

-- (단, 현재 사원이 한 명도 없는 신생 부서도 결과에 포함해야 하고, 퇴사한 직원은 제외할 것) 

-- 이라는 요건을 받고 아래와 같이 쿼리를 작성했습니다.



-- [작성된 코드]

SELECT D.DEPT_TITLE, E.EMP_NAME, MIN(E.HIRE_DATE) AS FIRST_HIRE

  FROM DEPARTMENT D

  LEFT JOIN EMPLOYEE E ON (D.DEPT_ID = E.DEPT_CODE)

 WHERE E.ENT_YN = 'N'

 GROUP BY D.DEPT_TITLE;



/*[문제]

이 쿼리는 에러를 발생시키며, 설령 에러 모드를 끄더라도 요건을 전혀 충족하지 못하는 엉터리 데이터가 나옵니다.

LEFT JOIN이 내부 조인처럼 동작하게 된 원인을 설명하고,

MIN(E.HIRE_DATE)와 E.EMP_NAME이 매칭되지 않는 그룹화 논리 오류를 설명한 뒤,

요건을 완벽하게 충족하도록 인라인 뷰(Inline View)를 사용하여 올바른 쿼리로 재작성하시오.​*/
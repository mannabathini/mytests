1. Attending cohort meetings, attending events.
2. Will be able to provide opportunity after completion of certificate in few months as presently
our application are on linux servers and we might move to cloud applications. 
3. Anusha has working experience in deploying application on AWS(EC2 instance, S3 bucket) using AIM script from Jules/ARM JOB



Min education level ? Bachelors degree in relevant fields
major fields of study required- mathematics, computer science or relevant fields
Is experience required for this position ? Yes
If yes, pls indicate the min number of months experience required to perform the position ? Masters+2, Bachelors+4
Is there an alternate combination of education and experience that is accepted for this position ? Yes 
If yes pls describe ?  Masters+2, Bachelors+4
Is exp in an alternate/related job acceptable ? Yes
If yes, please list app related jobs ? Programmer analyst, software engineer, software analyst
Detailed job description ? Job position on top of it
Fluency in foreign language ? No 
Specific Skills or other requirements? C, C++, SQL, JAVA, J2EE

My3
Madan has been extremely instrumental and has been engaged in stabilizing the EM UI throughout this year. He led several feature deliveries by collaborating with other teams (MyA&RSAM) that addressed not only referential integrity issues but also addressed several onboarding adoption friction items.He exhibited great partnership with Product Team in delivering several capabilities that allowed AOs to self-serve for Application Onboarding with improved user experience. He has been always helpful for onboarding team in providing any DB help for their reporting needs. He has been thorough and played critical role in providing justifications for the Auditing RFIs, by closely working with PO and Team. It is always pleasure to work with him and I can safely rely on him for any delivery enquires that I need to put together, this year he exhibited great collaboration and leadership in his engagements and I would like to continue to partner and closely work with him for next year opportunities.
  
Priyal 
Manan is very intelligent and a great leader. Besides working hands on, he is always available to guide and mentor the team. He is technically very strong in all areas API, UI and DB. He understands EM system very well and always looking to improve the it. He is easily approachable and always respectful. Madan is a great person and it is a pleasure to work with him.
  
Ajit
Madan is a very good person to work with. His subject knowledge of EM is exceptional and has provided great technical leadership to EM product; for KOPS/Mainframe, Third Party Websites onboarding, Pyramid/EMEA RACF. He was also very instrumental in resolving issues related to APIs and dB sync. He has been also very proactive in designing the upcoming features. I am looking forward to work with on the upcoming roadmap items.
We have an opportunity to aggressively plan the upcoming features so that the delivery is continuous.
  
  
Phani 
Madan is leading EM/AC API teams for Entitlement Manager Project. 
He involved in each major development or enhancement design, development. 
He provide best possible solutions to each disign issue or development issues. 
He helped me with DB scripts reviews and sign-off for deployments.
He has more business knowledge and grip on end to end flow and interaction with other systems like Sailpoint, RSAM and CPA. 
He identify any data issues one timely manner and provide guidence to fix them.
He is working as UI lead in obsence of UI lead and guiding the UI team as well.
He helped with Audit reports and presenting to the Auditors precisely to the point. He is a great asset to the team and his knowledge is remarkable.
  
  Srini 
What I did well:
Madan does a phenomenal job on all assigned projects; he meticulously designs all Services and thoroughly verifies, ensuring quality of the product is not at stake. He has remarkable technical and mentoring skills; that makes the team understand requirements quickly and clearly; thereby complete implementation and deliver on time. Additionally he is a very responsible, committed and hardworking individual; all these qualities make Madan a highly respectable and a great person to work with.

What I can do better:
Definetely, not finding much, as he is mostly well versed in all skills required at work.
  
2019 
  My3
  Madan is the backbone of Entitlement Manager and instrumental in making the Entitlement Manager to reach it’s GA milestone by end of Q3. From the beginning of the year he led several complex features in EM like Onboarding,  EverGreen Journey, Smart Approval API and Integration with EM etc with proper design and analysis in place. He is accountable to the work he takes up on and he is not only thorough from design, development to dev testing in any of the coding projects he does but also manages well documentation around it provides guidance to other developers.  He helped tremendously in running data validations and successfully led the data cleanup project. He helped in overlooking the EM adoption parties having proper collaboration in place with onboarding and business team, which made the effort seamless and successful. 2019 has been a great year, I encourage Madan to lead more technical initiatives, grow as a strong leader in 2020.
  
  
Case 1:  Application Owner (AO)	-- 	IO Approval OR any BIO Approval
Case 2:  Information Owner (IO)	--	AO Approval
Case 3:  Back-up IO (BIO)		--	IO Approval OR any other BIO Approval
Case 4:  Dual AO & IO 			--	Manager
Case 5:  Update Role User		-- 	Both AO AND (IO Approval OR BIO Approval)

Example data :
SEAL : 104657
AO : V737606
IO : V675479
BIO : F657830, R659047


Dynamic Flow sample payload 

Case 1:  Application Owner (AO)	-- 	IO Approval OR any BIO Approval
  "dynamic": {
    "parallel": {
      "pool": [
        {
          "ExternalGroup": {
            "@Source": "SEAL",
            "@Role": "App",
            "@Name": "Info, Backup info Owners",
            "@Identifier": "1",
            "additional": [
              {
                "@SID": "V675479"
              },
              {
                "@SID": "F657830"
              },
              {
                "@SID": "R659047"
              }
            ]
          }
        }
      ]
    }
  }
------
Case 2:  Information Owner (IO)	--	AO Approval
  "dynamic": {
    "parallel": {
      "pool": [
        {
          "additional": {
            "@SID": "V737606",
            "@RoleRequired": "True",
            "@RoleName": "Owner",
            "@ConfigItem": "App",
            "@Source": "SEAL"
          }
        }
      ]
    }
  }
------
Case 3:  Back-up IO (BIO)		--	IO Approval OR any other BIO Approval
  "dynamic": {
    "parallel": {
      "pool": [
        {
          "ExternalGroup": {
            "@Source": "SEAL",
            "@Role": "App",
            "@Name": "Info, Backup info Owners",
            "@Identifier": "1",
            "additional": [
              {
                "@SID": "V675479"
              },
              {
                "@SID": "F657830"
              }
            ]
          }
        }
      ]
    }
  }

---------
Case 4:  Dual AO & IO 			--	Manager
  "dynamic": {
    "parallel": {
      "pool": [
        {
          "additional": {
            "@SID": "F657830",
            "@RoleRequired": "True",
            "@RoleName": "Manager",
            "@ConfigItem": "User",
            "@Source": "IDENTITY"
          }
        }
      ]
    }
  }
  
---------
Case 5:  Update Role User		-- 	Both AO AND (IO Approval OR BIO Approval)

  "dynamic": {
    "parallel": {
      "pool": [
        {
          "additional": {
            "@SID": "V737606",
            "@RoleRequired": "True",
            "@RoleName": "Owner",
            "@ConfigItem": "App",
            "@Source": "SEAL"
          }
        },
        {
          "ExternalGroup": {
            "@Source": "SEAL",
            "@Role": "App",
            "@Name": "Info, Backup info Owners",
            "@Identifier": "1",
            "additional": [
              {
                "@SID": "V675479"
              },
              {
                "@SID": "F657830"
              },
              {
                "@SID": "R659047"
              }
            ]
          }
        }
      ]
    }
  }

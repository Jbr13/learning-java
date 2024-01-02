package EE.IQ.maven;

public class Introduction {

    /*
        Maven is a build automation tool that simplifies the process of managing a software project's build, dependencies,
        testing, and deployment. It uses a standardized project structure and a declarative XML file called
        pom.xml (Project Object Model) to define project configuration, dependencies, and build settings.

        ### Key Functionalities of Maven:

            Dependency Management: Maven manages project dependencies by fetching libraries and dependencies from repositories,
            both local and remote. It automatically resolves transitive dependencies, ensuring that all required libraries are
            available during the build process.

            Project Build Lifecycle: Maven defines a series of build phases (clean, compile, test, package, etc.) that define
            the sequence of tasks needed to build a project. It follows a standard build lifecycle, simplifying the build process.

            Convention over Configuration: Maven follows conventions, allowing projects to have a standard directory
            structure (src/main/java, src/test/java, etc.) and naming conventions. This helps in easily understanding and
            navigating different projects.

            Plugins: Maven uses plugins to extend its functionalities. There are various plugins available for different tasks
            like compiling code, running tests, generating reports, deploying artifacts, etc.

            Project Reporting: Maven generates project reports (such as code coverage reports, test reports, and static analysis
            reports) to provide insights into the project's health and status.

            Build Profiles: Maven supports build profiles that allow you to define different build configurations for different
            environments or purposes (e.g., development, testing, production).

            Reproducible Builds: Maven ensures reproducible builds by specifying project dependencies, versions, and configurations
            explicitly in the pom.xml file. This helps in maintaining consistency across different build environments.

            Basic Maven Workflow: Create a pom.xml file that defines the project configuration, dependencies, plugins, and build settings.
            Run Maven commands (mvn clean install, mvn compile, mvn test, etc.) to execute different phases of the build lifecycle.

        ### Benefits of Using Maven
            Simplifies project setup and management.
            Standardizes project structure and build process.
            Manages dependencies and handles transitive dependencies automatically.
            Enhances collaboration and consistency across projects.

        ### Maven workflow
            mvn clean: Removes the target directory, providing a clean slate for a new build.
            mvn compile: Compiles the source code(src/main/java -> target/classes/*).
            mvn test: Executes tests(that are inside test > java > *).
            mvn package: Packages the compiled code into an artifact (JAR, WAR, etc.(target > <project-name-1.0-SNAPSHOT>.jar)).
            mvn install: Installs the artifact into the local Maven repository(C:\Users\\user\.m2).
            mvn deploy: Copies the artifact to a remote repository or server.

        ### Local and Remote Repositories:
            Maven maintains a local repository (~/.m2/repository by default) on your machine to store downloaded dependencies
            and project artifacts. It can also deploy artifacts to remote repositories for sharing across teams or releasing
            open-source projects.

        ### Customization:
            You can customize Maven behavior by configuring the pom.xml file, specifying plugins, versions, build options, and more.

        ### Resources
            If we need to add images, files or whatever static files we need, or even application properties / configuration
            we will add into the resources folder that need to be put inside the src.main file. To tests is in src/test

        ### Submodules
            Refer to a feature allowing you to organize a larger project into smaller, manageable modules or subprojects,
            each with its own pom.xml configuration file. This concept is part of Maven's support for multi-module projects.

            ## Organizational Structure
                Submodules let you break down a large project into smaller, more manageable pieces, each representing a
                separate module or component of the overall project.

            ## Shared Parent POM
                Typically, a multi-module project has a parent project (often called an aggregator or parent POM) containing
                 common configurations, dependencies, and build settings shared among its modules.

            ## Independence and Interdependency
                Each submodule is like an independent Maven project with its own directory, source code, resources, and pom.xml
                file. However, submodules can also depend on each other within the same parent project.

            ## Parent-Child Relationship
                Submodules maintain a parent-child relationship with the parent project. The parent POM defines the modules
                 it manages, and each submodule refers to the parent POM for shared configurations.

            ## Build Order and Inheritance:
                Maven builds submodules in a specific order specified by the parent project. Submodules inherit settings
                from the parent POM, reducing redundancy and ensuring consistency across modules.

            ## Simplified Maintenance:
                Using submodules can enhance project maintenance, as changes in one module do not necessitate building
                the entire project. Each submodule can be developed, tested, and managed independently.
     */
}

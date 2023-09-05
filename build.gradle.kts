plugins	{
	id("io.moderne.rewrite")	version("1.0.34")
	`maven-publish`
}

allprojects	{
	group	=	"org.example"
	version	=	"0.0.1-SNAPSHOT"

	apply(plugin	=	"maven-publish")

	publishing	{
		repositories	{
			maven	{
				url	=	uri("https://artifactory.moderne.ninja/artifactory/moderne-ingest/")
				credentials	{
					username	=	""
					password	=	""
				}
			}
		}
		publications	{
			create<MavenPublication>("moderne")	{
				artifact(tasks.named("moderneJar"))
			}
		}
	}
}

repositories	{
	mavenCentral()
}



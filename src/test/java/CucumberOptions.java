public @interface CucumberOptions {
    String features();

    String glue();

    String tags();

    String[] plugin();

    boolean monochrome();

    boolean dryRun();
}

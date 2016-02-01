package co.touchlab.researchstack.core.step;
import co.touchlab.researchstack.core.model.ConsentSection;
import co.touchlab.researchstack.core.ui.step.layout.ConsentVisualStepLayout;

public class ConsentVisualStep extends Step
{
    private ConsentSection section;

    @Deprecated //TODO ViewTaskActivity should be handling this
    private String         nextButtonString;

    public ConsentVisualStep(String identifier)
    {
        super(identifier);
    }

    @Override
    public boolean isShowsProgress()
    {
        return false;
    }

    @Override
    public int getSceneTitle()
    {
        return co.touchlab.researchstack.core.R.string.rsc_consent;
    }

    @Override
    public Class getSceneClass()
    {
        return ConsentVisualStepLayout.class;
    }

    public ConsentSection getSection()
    {
        return section;
    }

    public void setSection(ConsentSection section)
    {
        this.section = section;
    }

    @Deprecated
    public String getNextButtonString()
    {
        return nextButtonString;
    }

    @Deprecated
    public void setNextButtonString(String nextButtonString)
    {
        this.nextButtonString = nextButtonString;
    }
}

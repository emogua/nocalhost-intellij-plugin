package dev.nocalhost.plugin.intellij.ui;

import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.ui.content.ContentManager;

import org.jetbrains.annotations.NotNull;

public class NocalhostConsoleWindowFactory implements ToolWindowFactory, DumbAware {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        NocalhostConsoleWindow nocalhostConsoleWindow = new NocalhostConsoleWindow(project, toolWindow);

        ContentManager contentManager = toolWindow.getContentManager();
        Content content = ContentFactory.SERVICE.getInstance().createContent(nocalhostConsoleWindow.getPanel(), "", false);
        contentManager.addContent(content);
        contentManager.setSelectedContent(content);
    }
}

package dev.nocalhost.plugin.intellij.topic;

import com.intellij.util.messages.Topic;

import java.util.List;

import dev.nocalhost.plugin.intellij.api.data.DevSpace;

public interface DevSpaceListUpdatedNotifier {
    Topic<DevSpaceListUpdatedNotifier> DEV_SPACE_LIST_UPDATED_NOTIFIER_TOPIC = Topic
            .create("DevSpace List updated", DevSpaceListUpdatedNotifier.class);

    void action(List<DevSpace> devSpaces);
}

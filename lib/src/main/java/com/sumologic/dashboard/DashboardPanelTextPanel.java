package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.859Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelTextPanel")
@software.amazon.jsii.Jsii.Proxy(DashboardPanelTextPanel.Jsii$Proxy.class)
public interface DashboardPanelTextPanel extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#key Dashboard#key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#keep_visual_settings_consistent_with_parent Dashboard#keep_visual_settings_consistent_with_parent}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getKeepVisualSettingsConsistentWithParent() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#text Dashboard#text}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getText() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#title Dashboard#title}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTitle() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#visual_settings Dashboard#visual_settings}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVisualSettings() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DashboardPanelTextPanel}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardPanelTextPanel}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardPanelTextPanel> {
        java.lang.String key;
        java.lang.Object keepVisualSettingsConsistentWithParent;
        java.lang.String text;
        java.lang.String title;
        java.lang.String visualSettings;

        /**
         * Sets the value of {@link DashboardPanelTextPanel#getKey}
         * @param key Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#key Dashboard#key}. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelTextPanel#getKeepVisualSettingsConsistentWithParent}
         * @param keepVisualSettingsConsistentWithParent Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#keep_visual_settings_consistent_with_parent Dashboard#keep_visual_settings_consistent_with_parent}.
         * @return {@code this}
         */
        public Builder keepVisualSettingsConsistentWithParent(java.lang.Boolean keepVisualSettingsConsistentWithParent) {
            this.keepVisualSettingsConsistentWithParent = keepVisualSettingsConsistentWithParent;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelTextPanel#getKeepVisualSettingsConsistentWithParent}
         * @param keepVisualSettingsConsistentWithParent Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#keep_visual_settings_consistent_with_parent Dashboard#keep_visual_settings_consistent_with_parent}.
         * @return {@code this}
         */
        public Builder keepVisualSettingsConsistentWithParent(com.hashicorp.cdktf.IResolvable keepVisualSettingsConsistentWithParent) {
            this.keepVisualSettingsConsistentWithParent = keepVisualSettingsConsistentWithParent;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelTextPanel#getText}
         * @param text Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#text Dashboard#text}.
         * @return {@code this}
         */
        public Builder text(java.lang.String text) {
            this.text = text;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelTextPanel#getTitle}
         * @param title Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#title Dashboard#title}.
         * @return {@code this}
         */
        public Builder title(java.lang.String title) {
            this.title = title;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelTextPanel#getVisualSettings}
         * @param visualSettings Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#visual_settings Dashboard#visual_settings}.
         * @return {@code this}
         */
        public Builder visualSettings(java.lang.String visualSettings) {
            this.visualSettings = visualSettings;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardPanelTextPanel}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardPanelTextPanel build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardPanelTextPanel}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardPanelTextPanel {
        private final java.lang.String key;
        private final java.lang.Object keepVisualSettingsConsistentWithParent;
        private final java.lang.String text;
        private final java.lang.String title;
        private final java.lang.String visualSettings;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.keepVisualSettingsConsistentWithParent = software.amazon.jsii.Kernel.get(this, "keepVisualSettingsConsistentWithParent", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.text = software.amazon.jsii.Kernel.get(this, "text", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.title = software.amazon.jsii.Kernel.get(this, "title", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.visualSettings = software.amazon.jsii.Kernel.get(this, "visualSettings", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(builder.key, "key is required");
            this.keepVisualSettingsConsistentWithParent = builder.keepVisualSettingsConsistentWithParent;
            this.text = builder.text;
            this.title = builder.title;
            this.visualSettings = builder.visualSettings;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.Object getKeepVisualSettingsConsistentWithParent() {
            return this.keepVisualSettingsConsistentWithParent;
        }

        @Override
        public final java.lang.String getText() {
            return this.text;
        }

        @Override
        public final java.lang.String getTitle() {
            return this.title;
        }

        @Override
        public final java.lang.String getVisualSettings() {
            return this.visualSettings;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("key", om.valueToTree(this.getKey()));
            if (this.getKeepVisualSettingsConsistentWithParent() != null) {
                data.set("keepVisualSettingsConsistentWithParent", om.valueToTree(this.getKeepVisualSettingsConsistentWithParent()));
            }
            if (this.getText() != null) {
                data.set("text", om.valueToTree(this.getText()));
            }
            if (this.getTitle() != null) {
                data.set("title", om.valueToTree(this.getTitle()));
            }
            if (this.getVisualSettings() != null) {
                data.set("visualSettings", om.valueToTree(this.getVisualSettings()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardPanelTextPanel"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardPanelTextPanel.Jsii$Proxy that = (DashboardPanelTextPanel.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            if (this.keepVisualSettingsConsistentWithParent != null ? !this.keepVisualSettingsConsistentWithParent.equals(that.keepVisualSettingsConsistentWithParent) : that.keepVisualSettingsConsistentWithParent != null) return false;
            if (this.text != null ? !this.text.equals(that.text) : that.text != null) return false;
            if (this.title != null ? !this.title.equals(that.title) : that.title != null) return false;
            return this.visualSettings != null ? this.visualSettings.equals(that.visualSettings) : that.visualSettings == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.keepVisualSettingsConsistentWithParent != null ? this.keepVisualSettingsConsistentWithParent.hashCode() : 0);
            result = 31 * result + (this.text != null ? this.text.hashCode() : 0);
            result = 31 * result + (this.title != null ? this.title.hashCode() : 0);
            result = 31 * result + (this.visualSettings != null ? this.visualSettings.hashCode() : 0);
            return result;
        }
    }
}

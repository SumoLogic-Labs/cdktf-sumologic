package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.826Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelSumoSearchPanel")
@software.amazon.jsii.Jsii.Proxy(DashboardPanelSumoSearchPanel.Jsii$Proxy.class)
public interface DashboardPanelSumoSearchPanel extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#key Dashboard#key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * coloring_rule block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#coloring_rule Dashboard#coloring_rule}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelColoringRule getColoringRule() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#description Dashboard#description}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#keep_visual_settings_consistent_with_parent Dashboard#keep_visual_settings_consistent_with_parent}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getKeepVisualSettingsConsistentWithParent() {
        return null;
    }

    /**
     * linked_dashboard block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#linked_dashboard Dashboard#linked_dashboard}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelLinkedDashboard getLinkedDashboard() {
        return null;
    }

    /**
     * query block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#query Dashboard#query}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getQuery() {
        return null;
    }

    /**
     * time_range block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#time_range Dashboard#time_range}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRange getTimeRange() {
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
     * @return a {@link Builder} of {@link DashboardPanelSumoSearchPanel}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardPanelSumoSearchPanel}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardPanelSumoSearchPanel> {
        java.lang.String key;
        com.sumologic.dashboard.DashboardPanelSumoSearchPanelColoringRule coloringRule;
        java.lang.String description;
        java.lang.Object keepVisualSettingsConsistentWithParent;
        com.sumologic.dashboard.DashboardPanelSumoSearchPanelLinkedDashboard linkedDashboard;
        java.lang.Object query;
        com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRange timeRange;
        java.lang.String title;
        java.lang.String visualSettings;

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanel#getKey}
         * @param key Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#key Dashboard#key}. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanel#getColoringRule}
         * @param coloringRule coloring_rule block.
         *                     Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#coloring_rule Dashboard#coloring_rule}
         * @return {@code this}
         */
        public Builder coloringRule(com.sumologic.dashboard.DashboardPanelSumoSearchPanelColoringRule coloringRule) {
            this.coloringRule = coloringRule;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanel#getDescription}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#description Dashboard#description}.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanel#getKeepVisualSettingsConsistentWithParent}
         * @param keepVisualSettingsConsistentWithParent Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#keep_visual_settings_consistent_with_parent Dashboard#keep_visual_settings_consistent_with_parent}.
         * @return {@code this}
         */
        public Builder keepVisualSettingsConsistentWithParent(java.lang.Boolean keepVisualSettingsConsistentWithParent) {
            this.keepVisualSettingsConsistentWithParent = keepVisualSettingsConsistentWithParent;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanel#getKeepVisualSettingsConsistentWithParent}
         * @param keepVisualSettingsConsistentWithParent Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#keep_visual_settings_consistent_with_parent Dashboard#keep_visual_settings_consistent_with_parent}.
         * @return {@code this}
         */
        public Builder keepVisualSettingsConsistentWithParent(com.hashicorp.cdktf.IResolvable keepVisualSettingsConsistentWithParent) {
            this.keepVisualSettingsConsistentWithParent = keepVisualSettingsConsistentWithParent;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanel#getLinkedDashboard}
         * @param linkedDashboard linked_dashboard block.
         *                        Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#linked_dashboard Dashboard#linked_dashboard}
         * @return {@code this}
         */
        public Builder linkedDashboard(com.sumologic.dashboard.DashboardPanelSumoSearchPanelLinkedDashboard linkedDashboard) {
            this.linkedDashboard = linkedDashboard;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanel#getQuery}
         * @param query query block.
         *              Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#query Dashboard#query}
         * @return {@code this}
         */
        public Builder query(com.hashicorp.cdktf.IResolvable query) {
            this.query = query;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanel#getQuery}
         * @param query query block.
         *              Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#query Dashboard#query}
         * @return {@code this}
         */
        public Builder query(java.util.List<? extends com.sumologic.dashboard.DashboardPanelSumoSearchPanelQuery> query) {
            this.query = query;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanel#getTimeRange}
         * @param timeRange time_range block.
         *                  Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#time_range Dashboard#time_range}
         * @return {@code this}
         */
        public Builder timeRange(com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanel#getTitle}
         * @param title Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#title Dashboard#title}.
         * @return {@code this}
         */
        public Builder title(java.lang.String title) {
            this.title = title;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanel#getVisualSettings}
         * @param visualSettings Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#visual_settings Dashboard#visual_settings}.
         * @return {@code this}
         */
        public Builder visualSettings(java.lang.String visualSettings) {
            this.visualSettings = visualSettings;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardPanelSumoSearchPanel}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardPanelSumoSearchPanel build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardPanelSumoSearchPanel}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardPanelSumoSearchPanel {
        private final java.lang.String key;
        private final com.sumologic.dashboard.DashboardPanelSumoSearchPanelColoringRule coloringRule;
        private final java.lang.String description;
        private final java.lang.Object keepVisualSettingsConsistentWithParent;
        private final com.sumologic.dashboard.DashboardPanelSumoSearchPanelLinkedDashboard linkedDashboard;
        private final java.lang.Object query;
        private final com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRange timeRange;
        private final java.lang.String title;
        private final java.lang.String visualSettings;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.coloringRule = software.amazon.jsii.Kernel.get(this, "coloringRule", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelColoringRule.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.keepVisualSettingsConsistentWithParent = software.amazon.jsii.Kernel.get(this, "keepVisualSettingsConsistentWithParent", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.linkedDashboard = software.amazon.jsii.Kernel.get(this, "linkedDashboard", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelLinkedDashboard.class));
            this.query = software.amazon.jsii.Kernel.get(this, "query", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.timeRange = software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRange.class));
            this.title = software.amazon.jsii.Kernel.get(this, "title", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.visualSettings = software.amazon.jsii.Kernel.get(this, "visualSettings", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(builder.key, "key is required");
            this.coloringRule = builder.coloringRule;
            this.description = builder.description;
            this.keepVisualSettingsConsistentWithParent = builder.keepVisualSettingsConsistentWithParent;
            this.linkedDashboard = builder.linkedDashboard;
            this.query = builder.query;
            this.timeRange = builder.timeRange;
            this.title = builder.title;
            this.visualSettings = builder.visualSettings;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final com.sumologic.dashboard.DashboardPanelSumoSearchPanelColoringRule getColoringRule() {
            return this.coloringRule;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.Object getKeepVisualSettingsConsistentWithParent() {
            return this.keepVisualSettingsConsistentWithParent;
        }

        @Override
        public final com.sumologic.dashboard.DashboardPanelSumoSearchPanelLinkedDashboard getLinkedDashboard() {
            return this.linkedDashboard;
        }

        @Override
        public final java.lang.Object getQuery() {
            return this.query;
        }

        @Override
        public final com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRange getTimeRange() {
            return this.timeRange;
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
            if (this.getColoringRule() != null) {
                data.set("coloringRule", om.valueToTree(this.getColoringRule()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getKeepVisualSettingsConsistentWithParent() != null) {
                data.set("keepVisualSettingsConsistentWithParent", om.valueToTree(this.getKeepVisualSettingsConsistentWithParent()));
            }
            if (this.getLinkedDashboard() != null) {
                data.set("linkedDashboard", om.valueToTree(this.getLinkedDashboard()));
            }
            if (this.getQuery() != null) {
                data.set("query", om.valueToTree(this.getQuery()));
            }
            if (this.getTimeRange() != null) {
                data.set("timeRange", om.valueToTree(this.getTimeRange()));
            }
            if (this.getTitle() != null) {
                data.set("title", om.valueToTree(this.getTitle()));
            }
            if (this.getVisualSettings() != null) {
                data.set("visualSettings", om.valueToTree(this.getVisualSettings()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardPanelSumoSearchPanel"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardPanelSumoSearchPanel.Jsii$Proxy that = (DashboardPanelSumoSearchPanel.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            if (this.coloringRule != null ? !this.coloringRule.equals(that.coloringRule) : that.coloringRule != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.keepVisualSettingsConsistentWithParent != null ? !this.keepVisualSettingsConsistentWithParent.equals(that.keepVisualSettingsConsistentWithParent) : that.keepVisualSettingsConsistentWithParent != null) return false;
            if (this.linkedDashboard != null ? !this.linkedDashboard.equals(that.linkedDashboard) : that.linkedDashboard != null) return false;
            if (this.query != null ? !this.query.equals(that.query) : that.query != null) return false;
            if (this.timeRange != null ? !this.timeRange.equals(that.timeRange) : that.timeRange != null) return false;
            if (this.title != null ? !this.title.equals(that.title) : that.title != null) return false;
            return this.visualSettings != null ? this.visualSettings.equals(that.visualSettings) : that.visualSettings == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.coloringRule != null ? this.coloringRule.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.keepVisualSettingsConsistentWithParent != null ? this.keepVisualSettingsConsistentWithParent.hashCode() : 0);
            result = 31 * result + (this.linkedDashboard != null ? this.linkedDashboard.hashCode() : 0);
            result = 31 * result + (this.query != null ? this.query.hashCode() : 0);
            result = 31 * result + (this.timeRange != null ? this.timeRange.hashCode() : 0);
            result = 31 * result + (this.title != null ? this.title.hashCode() : 0);
            result = 31 * result + (this.visualSettings != null ? this.visualSettings.hashCode() : 0);
            return result;
        }
    }
}

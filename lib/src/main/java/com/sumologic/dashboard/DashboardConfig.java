package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.818Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardConfig")
@software.amazon.jsii.Jsii.Proxy(DashboardConfig.Jsii$Proxy.class)
public interface DashboardConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * time_range block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#time_range Dashboard#time_range}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardTimeRange getTimeRange();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#title Dashboard#title}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTitle();

    /**
     * coloring_rule block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#coloring_rule Dashboard#coloring_rule}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getColoringRule() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#description Dashboard#description}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#domain Dashboard#domain}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDomain() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#folder_id Dashboard#folder_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFolderId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#id Dashboard#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * layout block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#layout Dashboard#layout}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardLayout getLayout() {
        return null;
    }

    /**
     * panel block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#panel Dashboard#panel}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPanel() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#refresh_interval Dashboard#refresh_interval}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRefreshInterval() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#theme Dashboard#theme}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTheme() {
        return null;
    }

    /**
     * topology_label_map block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#topology_label_map Dashboard#topology_label_map}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTopologyLabelMap getTopologyLabelMap() {
        return null;
    }

    /**
     * variable block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#variable Dashboard#variable}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getVariable() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DashboardConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardConfig> {
        com.sumologic.dashboard.DashboardTimeRange timeRange;
        java.lang.String title;
        java.lang.Object coloringRule;
        java.lang.String description;
        java.lang.String domain;
        java.lang.String folderId;
        java.lang.String id;
        com.sumologic.dashboard.DashboardLayout layout;
        java.lang.Object panel;
        java.lang.Number refreshInterval;
        java.lang.String theme;
        com.sumologic.dashboard.DashboardTopologyLabelMap topologyLabelMap;
        java.lang.Object variable;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link DashboardConfig#getTimeRange}
         * @param timeRange time_range block. This parameter is required.
         *                  Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#time_range Dashboard#time_range}
         * @return {@code this}
         */
        public Builder timeRange(com.sumologic.dashboard.DashboardTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getTitle}
         * @param title Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#title Dashboard#title}. This parameter is required.
         * @return {@code this}
         */
        public Builder title(java.lang.String title) {
            this.title = title;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getColoringRule}
         * @param coloringRule coloring_rule block.
         *                     Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#coloring_rule Dashboard#coloring_rule}
         * @return {@code this}
         */
        public Builder coloringRule(com.hashicorp.cdktf.IResolvable coloringRule) {
            this.coloringRule = coloringRule;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getColoringRule}
         * @param coloringRule coloring_rule block.
         *                     Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#coloring_rule Dashboard#coloring_rule}
         * @return {@code this}
         */
        public Builder coloringRule(java.util.List<? extends com.sumologic.dashboard.DashboardColoringRule> coloringRule) {
            this.coloringRule = coloringRule;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getDescription}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#description Dashboard#description}.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getDomain}
         * @param domain Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#domain Dashboard#domain}.
         * @return {@code this}
         */
        public Builder domain(java.lang.String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getFolderId}
         * @param folderId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#folder_id Dashboard#folder_id}.
         * @return {@code this}
         */
        public Builder folderId(java.lang.String folderId) {
            this.folderId = folderId;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#id Dashboard#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getLayout}
         * @param layout layout block.
         *               Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#layout Dashboard#layout}
         * @return {@code this}
         */
        public Builder layout(com.sumologic.dashboard.DashboardLayout layout) {
            this.layout = layout;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getPanel}
         * @param panel panel block.
         *              Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#panel Dashboard#panel}
         * @return {@code this}
         */
        public Builder panel(com.hashicorp.cdktf.IResolvable panel) {
            this.panel = panel;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getPanel}
         * @param panel panel block.
         *              Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#panel Dashboard#panel}
         * @return {@code this}
         */
        public Builder panel(java.util.List<? extends com.sumologic.dashboard.DashboardPanel> panel) {
            this.panel = panel;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getRefreshInterval}
         * @param refreshInterval Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#refresh_interval Dashboard#refresh_interval}.
         * @return {@code this}
         */
        public Builder refreshInterval(java.lang.Number refreshInterval) {
            this.refreshInterval = refreshInterval;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getTheme}
         * @param theme Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#theme Dashboard#theme}.
         * @return {@code this}
         */
        public Builder theme(java.lang.String theme) {
            this.theme = theme;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getTopologyLabelMap}
         * @param topologyLabelMap topology_label_map block.
         *                         Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#topology_label_map Dashboard#topology_label_map}
         * @return {@code this}
         */
        public Builder topologyLabelMap(com.sumologic.dashboard.DashboardTopologyLabelMap topologyLabelMap) {
            this.topologyLabelMap = topologyLabelMap;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getVariable}
         * @param variable variable block.
         *                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#variable Dashboard#variable}
         * @return {@code this}
         */
        public Builder variable(com.hashicorp.cdktf.IResolvable variable) {
            this.variable = variable;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getVariable}
         * @param variable variable block.
         *                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#variable Dashboard#variable}
         * @return {@code this}
         */
        public Builder variable(java.util.List<? extends com.sumologic.dashboard.DashboardVariable> variable) {
            this.variable = variable;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link DashboardConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardConfig {
        private final com.sumologic.dashboard.DashboardTimeRange timeRange;
        private final java.lang.String title;
        private final java.lang.Object coloringRule;
        private final java.lang.String description;
        private final java.lang.String domain;
        private final java.lang.String folderId;
        private final java.lang.String id;
        private final com.sumologic.dashboard.DashboardLayout layout;
        private final java.lang.Object panel;
        private final java.lang.Number refreshInterval;
        private final java.lang.String theme;
        private final com.sumologic.dashboard.DashboardTopologyLabelMap topologyLabelMap;
        private final java.lang.Object variable;
        private final java.lang.Object connection;
        private final java.lang.Object count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.timeRange = software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRange.class));
            this.title = software.amazon.jsii.Kernel.get(this, "title", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.coloringRule = software.amazon.jsii.Kernel.get(this, "coloringRule", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.domain = software.amazon.jsii.Kernel.get(this, "domain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.folderId = software.amazon.jsii.Kernel.get(this, "folderId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.layout = software.amazon.jsii.Kernel.get(this, "layout", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardLayout.class));
            this.panel = software.amazon.jsii.Kernel.get(this, "panel", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.refreshInterval = software.amazon.jsii.Kernel.get(this, "refreshInterval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.theme = software.amazon.jsii.Kernel.get(this, "theme", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.topologyLabelMap = software.amazon.jsii.Kernel.get(this, "topologyLabelMap", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTopologyLabelMap.class));
            this.variable = software.amazon.jsii.Kernel.get(this, "variable", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.timeRange = java.util.Objects.requireNonNull(builder.timeRange, "timeRange is required");
            this.title = java.util.Objects.requireNonNull(builder.title, "title is required");
            this.coloringRule = builder.coloringRule;
            this.description = builder.description;
            this.domain = builder.domain;
            this.folderId = builder.folderId;
            this.id = builder.id;
            this.layout = builder.layout;
            this.panel = builder.panel;
            this.refreshInterval = builder.refreshInterval;
            this.theme = builder.theme;
            this.topologyLabelMap = builder.topologyLabelMap;
            this.variable = builder.variable;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final com.sumologic.dashboard.DashboardTimeRange getTimeRange() {
            return this.timeRange;
        }

        @Override
        public final java.lang.String getTitle() {
            return this.title;
        }

        @Override
        public final java.lang.Object getColoringRule() {
            return this.coloringRule;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getDomain() {
            return this.domain;
        }

        @Override
        public final java.lang.String getFolderId() {
            return this.folderId;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final com.sumologic.dashboard.DashboardLayout getLayout() {
            return this.layout;
        }

        @Override
        public final java.lang.Object getPanel() {
            return this.panel;
        }

        @Override
        public final java.lang.Number getRefreshInterval() {
            return this.refreshInterval;
        }

        @Override
        public final java.lang.String getTheme() {
            return this.theme;
        }

        @Override
        public final com.sumologic.dashboard.DashboardTopologyLabelMap getTopologyLabelMap() {
            return this.topologyLabelMap;
        }

        @Override
        public final java.lang.Object getVariable() {
            return this.variable;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Object getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("timeRange", om.valueToTree(this.getTimeRange()));
            data.set("title", om.valueToTree(this.getTitle()));
            if (this.getColoringRule() != null) {
                data.set("coloringRule", om.valueToTree(this.getColoringRule()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDomain() != null) {
                data.set("domain", om.valueToTree(this.getDomain()));
            }
            if (this.getFolderId() != null) {
                data.set("folderId", om.valueToTree(this.getFolderId()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getLayout() != null) {
                data.set("layout", om.valueToTree(this.getLayout()));
            }
            if (this.getPanel() != null) {
                data.set("panel", om.valueToTree(this.getPanel()));
            }
            if (this.getRefreshInterval() != null) {
                data.set("refreshInterval", om.valueToTree(this.getRefreshInterval()));
            }
            if (this.getTheme() != null) {
                data.set("theme", om.valueToTree(this.getTheme()));
            }
            if (this.getTopologyLabelMap() != null) {
                data.set("topologyLabelMap", om.valueToTree(this.getTopologyLabelMap()));
            }
            if (this.getVariable() != null) {
                data.set("variable", om.valueToTree(this.getVariable()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardConfig.Jsii$Proxy that = (DashboardConfig.Jsii$Proxy) o;

            if (!timeRange.equals(that.timeRange)) return false;
            if (!title.equals(that.title)) return false;
            if (this.coloringRule != null ? !this.coloringRule.equals(that.coloringRule) : that.coloringRule != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.domain != null ? !this.domain.equals(that.domain) : that.domain != null) return false;
            if (this.folderId != null ? !this.folderId.equals(that.folderId) : that.folderId != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.layout != null ? !this.layout.equals(that.layout) : that.layout != null) return false;
            if (this.panel != null ? !this.panel.equals(that.panel) : that.panel != null) return false;
            if (this.refreshInterval != null ? !this.refreshInterval.equals(that.refreshInterval) : that.refreshInterval != null) return false;
            if (this.theme != null ? !this.theme.equals(that.theme) : that.theme != null) return false;
            if (this.topologyLabelMap != null ? !this.topologyLabelMap.equals(that.topologyLabelMap) : that.topologyLabelMap != null) return false;
            if (this.variable != null ? !this.variable.equals(that.variable) : that.variable != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.timeRange.hashCode();
            result = 31 * result + (this.title.hashCode());
            result = 31 * result + (this.coloringRule != null ? this.coloringRule.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.domain != null ? this.domain.hashCode() : 0);
            result = 31 * result + (this.folderId != null ? this.folderId.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.layout != null ? this.layout.hashCode() : 0);
            result = 31 * result + (this.panel != null ? this.panel.hashCode() : 0);
            result = 31 * result + (this.refreshInterval != null ? this.refreshInterval.hashCode() : 0);
            result = 31 * result + (this.theme != null ? this.theme.hashCode() : 0);
            result = 31 * result + (this.topologyLabelMap != null ? this.topologyLabelMap.hashCode() : 0);
            result = 31 * result + (this.variable != null ? this.variable.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}

package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.823Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanel")
@software.amazon.jsii.Jsii.Proxy(DashboardPanel.Jsii$Proxy.class)
public interface DashboardPanel extends software.amazon.jsii.JsiiSerializable {

    /**
     * sumo_search_panel block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#sumo_search_panel Dashboard#sumo_search_panel}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanel getSumoSearchPanel() {
        return null;
    }

    /**
     * text_panel block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#text_panel Dashboard#text_panel}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelTextPanel getTextPanel() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DashboardPanel}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardPanel}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardPanel> {
        com.sumologic.dashboard.DashboardPanelSumoSearchPanel sumoSearchPanel;
        com.sumologic.dashboard.DashboardPanelTextPanel textPanel;

        /**
         * Sets the value of {@link DashboardPanel#getSumoSearchPanel}
         * @param sumoSearchPanel sumo_search_panel block.
         *                        Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#sumo_search_panel Dashboard#sumo_search_panel}
         * @return {@code this}
         */
        public Builder sumoSearchPanel(com.sumologic.dashboard.DashboardPanelSumoSearchPanel sumoSearchPanel) {
            this.sumoSearchPanel = sumoSearchPanel;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanel#getTextPanel}
         * @param textPanel text_panel block.
         *                  Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#text_panel Dashboard#text_panel}
         * @return {@code this}
         */
        public Builder textPanel(com.sumologic.dashboard.DashboardPanelTextPanel textPanel) {
            this.textPanel = textPanel;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardPanel}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardPanel build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardPanel}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardPanel {
        private final com.sumologic.dashboard.DashboardPanelSumoSearchPanel sumoSearchPanel;
        private final com.sumologic.dashboard.DashboardPanelTextPanel textPanel;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.sumoSearchPanel = software.amazon.jsii.Kernel.get(this, "sumoSearchPanel", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanel.class));
            this.textPanel = software.amazon.jsii.Kernel.get(this, "textPanel", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelTextPanel.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.sumoSearchPanel = builder.sumoSearchPanel;
            this.textPanel = builder.textPanel;
        }

        @Override
        public final com.sumologic.dashboard.DashboardPanelSumoSearchPanel getSumoSearchPanel() {
            return this.sumoSearchPanel;
        }

        @Override
        public final com.sumologic.dashboard.DashboardPanelTextPanel getTextPanel() {
            return this.textPanel;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getSumoSearchPanel() != null) {
                data.set("sumoSearchPanel", om.valueToTree(this.getSumoSearchPanel()));
            }
            if (this.getTextPanel() != null) {
                data.set("textPanel", om.valueToTree(this.getTextPanel()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardPanel"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardPanel.Jsii$Proxy that = (DashboardPanel.Jsii$Proxy) o;

            if (this.sumoSearchPanel != null ? !this.sumoSearchPanel.equals(that.sumoSearchPanel) : that.sumoSearchPanel != null) return false;
            return this.textPanel != null ? this.textPanel.equals(that.textPanel) : that.textPanel == null;
        }

        @Override
        public final int hashCode() {
            int result = this.sumoSearchPanel != null ? this.sumoSearchPanel.hashCode() : 0;
            result = 31 * result + (this.textPanel != null ? this.textPanel.hashCode() : 0);
            return result;
        }
    }
}

package com.sumologic.hierarchy;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.013Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.hierarchy.HierarchyLevelNextLevelsWithConditions")
@software.amazon.jsii.Jsii.Proxy(HierarchyLevelNextLevelsWithConditions.Jsii$Proxy.class)
public interface HierarchyLevelNextLevelsWithConditions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/hierarchy#condition Hierarchy#condition}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getCondition();

    /**
     * level block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/hierarchy#level Hierarchy#level}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getLevel();

    /**
     * @return a {@link Builder} of {@link HierarchyLevelNextLevelsWithConditions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HierarchyLevelNextLevelsWithConditions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HierarchyLevelNextLevelsWithConditions> {
        java.lang.String condition;
        java.lang.Object level;

        /**
         * Sets the value of {@link HierarchyLevelNextLevelsWithConditions#getCondition}
         * @param condition Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/hierarchy#condition Hierarchy#condition}. This parameter is required.
         * @return {@code this}
         */
        public Builder condition(java.lang.String condition) {
            this.condition = condition;
            return this;
        }

        /**
         * Sets the value of {@link HierarchyLevelNextLevelsWithConditions#getLevel}
         * @param level level block. This parameter is required.
         *              Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/hierarchy#level Hierarchy#level}
         * @return {@code this}
         */
        public Builder level(com.hashicorp.cdktf.IResolvable level) {
            this.level = level;
            return this;
        }

        /**
         * Sets the value of {@link HierarchyLevelNextLevelsWithConditions#getLevel}
         * @param level level block. This parameter is required.
         *              Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/hierarchy#level Hierarchy#level}
         * @return {@code this}
         */
        public Builder level(java.util.List<? extends com.sumologic.hierarchy.HierarchyLevel> level) {
            this.level = level;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HierarchyLevelNextLevelsWithConditions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HierarchyLevelNextLevelsWithConditions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HierarchyLevelNextLevelsWithConditions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HierarchyLevelNextLevelsWithConditions {
        private final java.lang.String condition;
        private final java.lang.Object level;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.condition = software.amazon.jsii.Kernel.get(this, "condition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.level = software.amazon.jsii.Kernel.get(this, "level", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.condition = java.util.Objects.requireNonNull(builder.condition, "condition is required");
            this.level = java.util.Objects.requireNonNull(builder.level, "level is required");
        }

        @Override
        public final java.lang.String getCondition() {
            return this.condition;
        }

        @Override
        public final java.lang.Object getLevel() {
            return this.level;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("condition", om.valueToTree(this.getCondition()));
            data.set("level", om.valueToTree(this.getLevel()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.hierarchy.HierarchyLevelNextLevelsWithConditions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HierarchyLevelNextLevelsWithConditions.Jsii$Proxy that = (HierarchyLevelNextLevelsWithConditions.Jsii$Proxy) o;

            if (!condition.equals(that.condition)) return false;
            return this.level.equals(that.level);
        }

        @Override
        public final int hashCode() {
            int result = this.condition.hashCode();
            result = 31 * result + (this.level.hashCode());
            return result;
        }
    }
}

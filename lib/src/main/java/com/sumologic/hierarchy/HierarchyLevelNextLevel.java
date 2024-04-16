package com.sumologic.hierarchy;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.011Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.hierarchy.HierarchyLevelNextLevel")
@software.amazon.jsii.Jsii.Proxy(HierarchyLevelNextLevel.Jsii$Proxy.class)
public interface HierarchyLevelNextLevel extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/hierarchy#entity_type Hierarchy#entity_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEntityType();

    /**
     * next_level block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/hierarchy#next_level Hierarchy#next_level}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.hierarchy.HierarchyLevelNextLevel getNextLevel() {
        return null;
    }

    /**
     * next_levels_with_conditions block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/hierarchy#next_levels_with_conditions Hierarchy#next_levels_with_conditions}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getNextLevelsWithConditions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HierarchyLevelNextLevel}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HierarchyLevelNextLevel}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HierarchyLevelNextLevel> {
        java.lang.String entityType;
        com.sumologic.hierarchy.HierarchyLevelNextLevel nextLevel;
        java.lang.Object nextLevelsWithConditions;

        /**
         * Sets the value of {@link HierarchyLevelNextLevel#getEntityType}
         * @param entityType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/hierarchy#entity_type Hierarchy#entity_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder entityType(java.lang.String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * Sets the value of {@link HierarchyLevelNextLevel#getNextLevel}
         * @param nextLevel next_level block.
         *                  Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/hierarchy#next_level Hierarchy#next_level}
         * @return {@code this}
         */
        public Builder nextLevel(com.sumologic.hierarchy.HierarchyLevelNextLevel nextLevel) {
            this.nextLevel = nextLevel;
            return this;
        }

        /**
         * Sets the value of {@link HierarchyLevelNextLevel#getNextLevelsWithConditions}
         * @param nextLevelsWithConditions next_levels_with_conditions block.
         *                                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/hierarchy#next_levels_with_conditions Hierarchy#next_levels_with_conditions}
         * @return {@code this}
         */
        public Builder nextLevelsWithConditions(com.hashicorp.cdktf.IResolvable nextLevelsWithConditions) {
            this.nextLevelsWithConditions = nextLevelsWithConditions;
            return this;
        }

        /**
         * Sets the value of {@link HierarchyLevelNextLevel#getNextLevelsWithConditions}
         * @param nextLevelsWithConditions next_levels_with_conditions block.
         *                                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/hierarchy#next_levels_with_conditions Hierarchy#next_levels_with_conditions}
         * @return {@code this}
         */
        public Builder nextLevelsWithConditions(java.util.List<? extends com.sumologic.hierarchy.HierarchyLevelNextLevelNextLevelsWithConditions> nextLevelsWithConditions) {
            this.nextLevelsWithConditions = nextLevelsWithConditions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HierarchyLevelNextLevel}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HierarchyLevelNextLevel build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HierarchyLevelNextLevel}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HierarchyLevelNextLevel {
        private final java.lang.String entityType;
        private final com.sumologic.hierarchy.HierarchyLevelNextLevel nextLevel;
        private final java.lang.Object nextLevelsWithConditions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.entityType = software.amazon.jsii.Kernel.get(this, "entityType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nextLevel = software.amazon.jsii.Kernel.get(this, "nextLevel", software.amazon.jsii.NativeType.forClass(com.sumologic.hierarchy.HierarchyLevelNextLevel.class));
            this.nextLevelsWithConditions = software.amazon.jsii.Kernel.get(this, "nextLevelsWithConditions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.entityType = java.util.Objects.requireNonNull(builder.entityType, "entityType is required");
            this.nextLevel = builder.nextLevel;
            this.nextLevelsWithConditions = builder.nextLevelsWithConditions;
        }

        @Override
        public final java.lang.String getEntityType() {
            return this.entityType;
        }

        @Override
        public final com.sumologic.hierarchy.HierarchyLevelNextLevel getNextLevel() {
            return this.nextLevel;
        }

        @Override
        public final java.lang.Object getNextLevelsWithConditions() {
            return this.nextLevelsWithConditions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("entityType", om.valueToTree(this.getEntityType()));
            if (this.getNextLevel() != null) {
                data.set("nextLevel", om.valueToTree(this.getNextLevel()));
            }
            if (this.getNextLevelsWithConditions() != null) {
                data.set("nextLevelsWithConditions", om.valueToTree(this.getNextLevelsWithConditions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.hierarchy.HierarchyLevelNextLevel"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HierarchyLevelNextLevel.Jsii$Proxy that = (HierarchyLevelNextLevel.Jsii$Proxy) o;

            if (!entityType.equals(that.entityType)) return false;
            if (this.nextLevel != null ? !this.nextLevel.equals(that.nextLevel) : that.nextLevel != null) return false;
            return this.nextLevelsWithConditions != null ? this.nextLevelsWithConditions.equals(that.nextLevelsWithConditions) : that.nextLevelsWithConditions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.entityType.hashCode();
            result = 31 * result + (this.nextLevel != null ? this.nextLevel.hashCode() : 0);
            result = 31 * result + (this.nextLevelsWithConditions != null ? this.nextLevelsWithConditions.hashCode() : 0);
            return result;
        }
    }
}

package com.j256.ormlite.field.types; class IntegerObjectType { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/field/types/IntegerObjectType;
a=0;// .super Lcom/j256/ormlite/field/types/BaseDataType;
a=0;// .source "IntegerObjectType.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final singleTon:Lcom/j256/ormlite/field/types/IntegerObjectType;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     new-instance v0, Lcom/j256/ormlite/field/types/IntegerObjectType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/field/types/IntegerObjectType;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/field/types/IntegerObjectType;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/IntegerObjectType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/field/types/IntegerObjectType;->singleTon:Lcom/j256/ormlite/field/types/IntegerObjectType;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     sget-object v0, Lcom/j256/ormlite/field/SqlType;->INTEGER:Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-class v3, Ljava/lang/Integer;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/field/types/BaseDataType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/IntegerObjectType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected constructor <init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;//     .locals 0
a=0;//     .param p1, "sqlType"    # Lcom/j256/ormlite/field/SqlType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/field/SqlType;",
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     .local p2, "classes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     invoke-direct {p0, p1, p2}, Lcom/j256/ormlite/field/types/BaseDataType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/IntegerObjectType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getSingleton()Lcom/j256/ormlite/field/types/IntegerObjectType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     sget-object v0, Lcom/j256/ormlite/field/types/IntegerObjectType;->singleTon:Lcom/j256/ormlite/field/types/IntegerObjectType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/IntegerObjectType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public convertIdNumber(Ljava/lang/Number;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "number"    # Ljava/lang/Number;
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-virtual {p1}, Ljava/lang/Number;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isEscapedValue()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isValidForVersion()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isValidGeneratedType()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public moveToNextValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "currentValue"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 65
a=0;//     .end local p1    # "currentValue":Ljava/lang/Object;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local p1    # "currentValue":Ljava/lang/Object;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     check-cast p1, Ljava/lang/Integer;
a=0;// 
a=0;//     .end local p1    # "currentValue":Ljava/lang/Object;
a=0;//     invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public parseDefaultString(Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "defaultStr"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public resultToSqlArg(Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/support/DatabaseResults;I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "results"    # Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .param p3, "columnPos"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-interface {p2, p3}, Lcom/j256/ormlite/support/DatabaseResults;->getInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v0
a=0;// .end method
}}

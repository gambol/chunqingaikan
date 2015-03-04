package com.j256.ormlite.field.types; class FloatType { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/field/types/FloatType;
a=0;// .super Lcom/j256/ormlite/field/types/FloatObjectType;
a=0;// .source "FloatType.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final singleTon:Lcom/j256/ormlite/field/types/FloatType;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     new-instance v0, Lcom/j256/ormlite/field/types/FloatType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/field/types/FloatType;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/field/types/FloatType;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/FloatType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/field/types/FloatType;->singleTon:Lcom/j256/ormlite/field/types/FloatType;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     sget-object v0, Lcom/j256/ormlite/field/SqlType;->FLOAT:Lcom/j256/ormlite/field/SqlType;
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
a=0;//     sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/field/types/FloatObjectType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 20
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/FloatType;);
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
a=0;//     .line 26
a=0;//     .local p2, "classes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     invoke-direct {p0, p1, p2}, Lcom/j256/ormlite/field/types/FloatObjectType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/FloatType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getSingleton()Lcom/j256/ormlite/field/types/FloatType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     sget-object v0, Lcom/j256/ormlite/field/types/FloatType;->singleTon:Lcom/j256/ormlite/field/types/FloatType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/FloatType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isPrimitive()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}

package com.j256.ormlite.field.types; class UuidType { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/field/types/UuidType;
a=0;// .super Lcom/j256/ormlite/field/types/BaseDataType;
a=0;// .source "UuidType.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static DEFAULT_WIDTH:I
a=0;// 
a=0;// .field private static final singleTon:Lcom/j256/ormlite/field/types/UuidType;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     const/16 v0, 0x30
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/j256/ormlite/field/types/UuidType;->DEFAULT_WIDTH:I
a=0;// 
a=0;//     .line 20
a=0;//     new-instance v0, Lcom/j256/ormlite/field/types/UuidType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/field/types/UuidType;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/field/types/UuidType;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/UuidType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/field/types/UuidType;->singleTon:Lcom/j256/ormlite/field/types/UuidType;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     sget-object v0, Lcom/j256/ormlite/field/SqlType;->STRING:Lcom/j256/ormlite/field/SqlType;
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
a=0;//     const-class v3, Ljava/util/UUID;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/field/types/BaseDataType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/UuidType;);
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
a=0;//     .line 34
a=0;//     .local p2, "classes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     invoke-direct {p0, p1, p2}, Lcom/j256/ormlite/field/types/BaseDataType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 35
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/UuidType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getSingleton()Lcom/j256/ormlite/field/types/UuidType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     sget-object v0, Lcom/j256/ormlite/field/types/UuidType;->singleTon:Lcom/j256/ormlite/field/types/UuidType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/UuidType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public generateId()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/UUID;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDefaultWidth()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     sget v0, Lcom/j256/ormlite/field/types/UuidType;->DEFAULT_WIDTH:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isSelfGeneratedId()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
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
a=0;//     .line 71
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public javaToSqlArg(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "obj"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     move-object v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/UUID;
a=0;// 
a=0;//     .line 66
a=0;//     .local v0, "uuid":Ljava/util/UUID;
a=0;//     invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public parseDefaultString(Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "defaultStr"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     :try_start_0
a=0;//     invoke-static {p2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/UUID;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 41
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 42
a=0;//     .local v0, "e":Ljava/lang/IllegalArgumentException;
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Problems with field "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " parsing default UUID-string \'"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\'"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     throw v1
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
a=0;//     .line 49
a=0;//     invoke-interface {p2, p3}, Lcom/j256/ormlite/support/DatabaseResults;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public sqlArgToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;I)Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "sqlArg"    # Ljava/lang/Object;
a=0;//     .param p3, "columnPos"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     move-object v1, p2
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     .line 56
a=0;//     .local v1, "uuidStr":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/UUID;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 57
a=0;//     :catch_0
a=0;//     #v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 58
a=0;//     .local v0, "e":Ljava/lang/IllegalArgumentException;
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Problems with column "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " parsing UUID-string \'"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\'"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     throw v2
a=0;// .end method
}}

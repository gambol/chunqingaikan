package com.j256.ormlite.stmt; class StatementBuilder$StatementType { void a() { int a;
a=0;// .class public final enum Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// .super Ljava/lang/Enum;
a=0;// .source "StatementBuilder.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x4019
a=0;//     name = "StatementType"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Enum",
a=0;//         "<",
a=0;//         "Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final synthetic $VALUES:[Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;// .field public static final enum DELETE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;// .field public static final enum EXECUTE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;// .field public static final enum SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;// .field public static final enum SELECT_LONG:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;// .field public static final enum SELECT_RAW:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;// .field public static final enum UPDATE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final okForExecute:Z
a=0;// 
a=0;// .field private final okForQuery:Z
a=0;// 
a=0;// .field private final okForStatementBuilder:Z
a=0;// 
a=0;// .field private final okForUpdate:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v13, 0x4
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     const/4 v12, 0x3
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 193
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     const-string v1, "SELECT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(One);
a=0;//     move v5, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move v6, v2
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;-><init>(Ljava/lang/String;IZZZZ)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     .line 195
a=0;//     new-instance v4, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     const-string v5, "SELECT_LONG"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move v6, v3
a=0;// 
a=0;//     #v6=(One);
a=0;//     move v7, v3
a=0;// 
a=0;//     #v7=(One);
a=0;//     move v8, v3
a=0;// 
a=0;//     #v8=(One);
a=0;//     move v9, v2
a=0;// 
a=0;//     #v9=(Null);
a=0;//     move v10, v2
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-direct/range {v4 .. v10}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;-><init>(Ljava/lang/String;IZZZZ)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sput-object v4, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_LONG:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     .line 197
a=0;//     new-instance v4, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     const-string v5, "SELECT_RAW"
a=0;// 
a=0;//     move v6, v11
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     move v7, v3
a=0;// 
a=0;//     move v8, v3
a=0;// 
a=0;//     move v9, v2
a=0;// 
a=0;//     move v10, v2
a=0;// 
a=0;//     invoke-direct/range {v4 .. v10}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;-><init>(Ljava/lang/String;IZZZZ)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sput-object v4, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_RAW:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     .line 199
a=0;//     new-instance v4, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     const-string v5, "UPDATE"
a=0;// 
a=0;//     move v6, v12
a=0;// 
a=0;//     move v7, v3
a=0;// 
a=0;//     move v8, v2
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move v9, v3
a=0;// 
a=0;//     #v9=(One);
a=0;//     move v10, v2
a=0;// 
a=0;//     invoke-direct/range {v4 .. v10}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;-><init>(Ljava/lang/String;IZZZZ)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sput-object v4, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->UPDATE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     .line 201
a=0;//     new-instance v4, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     const-string v5, "DELETE"
a=0;// 
a=0;//     move v6, v13
a=0;// 
a=0;//     move v7, v3
a=0;// 
a=0;//     move v8, v2
a=0;// 
a=0;//     move v9, v3
a=0;// 
a=0;//     move v10, v2
a=0;// 
a=0;//     invoke-direct/range {v4 .. v10}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;-><init>(Ljava/lang/String;IZZZZ)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sput-object v4, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->DELETE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     .line 203
a=0;//     new-instance v4, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     const-string v5, "EXECUTE"
a=0;// 
a=0;//     const/4 v6, 0x5
a=0;// 
a=0;//     move v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move v8, v2
a=0;// 
a=0;//     move v9, v2
a=0;// 
a=0;//     #v9=(Null);
a=0;//     move v10, v3
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-direct/range {v4 .. v10}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;-><init>(Ljava/lang/String;IZZZZ)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sput-object v4, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->EXECUTE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     .line 191
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_LONG:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_RAW:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     aput-object v1, v0, v11
a=0;// 
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->UPDATE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     aput-object v1, v0, v12
a=0;// 
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->DELETE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     aput-object v1, v0, v13
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->EXECUTE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->$VALUES:[Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;IZZZZ)V
a=0;//     .locals 0
a=0;//     .param p3, "okForStatementBuilder"    # Z
a=0;//     .param p4, "okForQuery"    # Z
a=0;//     .param p5, "okForUpdate"    # Z
a=0;//     .param p6, "okForExecute"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(ZZZZ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 214
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     iput-boolean p3, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForStatementBuilder:Z
a=0;// 
a=0;//     .line 215
a=0;//     iput-boolean p4, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForQuery:Z
a=0;// 
a=0;//     .line 216
a=0;//     iput-boolean p5, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForUpdate:Z
a=0;// 
a=0;//     .line 217
a=0;//     iput-boolean p6, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForExecute:Z
a=0;// 
a=0;//     .line 218
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static valueOf(Ljava/lang/String;)Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;//     .locals 1
a=0;//     .param p0, "name"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     const-class v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static values()[Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->$VALUES:[Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-virtual {v0}, [Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isOkForExecute()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForExecute:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isOkForQuery()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForQuery:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isOkForStatementBuilder()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForStatementBuilder:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isOkForUpdate()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForUpdate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}

package com.tencent.connect.auth; class AuthMap { void a() { int a;
a=0;// .class public Lcom/tencent/connect/auth/AuthMap;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/connect/auth/AuthMap$Auth;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final synthetic a:Z
a=0;// 
a=0;// .field private static b:I
a=0;// 
a=0;// .field public static sInstance:Lcom/tencent/connect/auth/AuthMap;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public final KEY_CHAR_LIST:Ljava/lang/String;
a=0;// 
a=0;// .field public authMap:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/tencent/connect/auth/AuthMap$Auth;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 8
a=0;//     #v1=(Null);
a=0;//     const-class v0, Lcom/tencent/connect/auth/AuthMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     sput-boolean v0, Lcom/tencent/connect/auth/AuthMap;->a:Z
a=0;// 
a=0;//     .line 11
a=0;//     sput v1, Lcom/tencent/connect/auth/AuthMap;->b:I
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 8
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 8
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthMap;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthMap;->authMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 53
a=0;//     const-string v0, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthMap;->KEY_CHAR_LIST:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 74
a=0;//     #v0=(Null);
a=0;//     sget-boolean v1, Lcom/tencent/connect/auth/AuthMap;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     rem-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 77
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 79
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     div-int/lit8 v4, v1, 0x2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v0, v4, :cond_1
a=0;// 
a=0;//     .line 80
a=0;//     mul-int/lit8 v5, v0, 0x2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-int/lit8 v6, v0, 0x2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x2
a=0;// 
a=0;//     invoke-virtual {p1, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 81
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/16 v6, 0x10
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 83
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 84
a=0;//     #v6=(Char);
a=0;//     xor-int/2addr v5, v6
a=0;// 
a=0;//     .line 86
a=0;//     int-to-char v5, v5
a=0;// 
a=0;//     #v5=(Char);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 88
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 89
a=0;//     rem-int/2addr v1, v3
a=0;// 
a=0;//     .line 79
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance()Lcom/tencent/connect/auth/AuthMap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthMap;->sInstance:Lcom/tencent/connect/auth/AuthMap;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 23
a=0;//     new-instance v0, Lcom/tencent/connect/auth/AuthMap;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/auth/AuthMap;);
a=0;//     invoke-direct {v0}, Lcom/tencent/connect/auth/AuthMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthMap;);
a=0;//     sput-object v0, Lcom/tencent/connect/auth/AuthMap;->sInstance:Lcom/tencent/connect/auth/AuthMap;
a=0;// 
a=0;//     .line 25
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthMap;->sInstance:Lcom/tencent/connect/auth/AuthMap;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getSerial()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     sget v0, Lcom/tencent/connect/auth/AuthMap;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     sput v0, Lcom/tencent/connect/auth/AuthMap;->b:I
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/auth/AuthMap;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;)Lcom/tencent/connect/auth/AuthMap$Auth;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthMap;->authMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/connect/auth/AuthMap$Auth;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public makeKey()Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-static {}, Ljava/lang/Math;->random()D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide/high16 v2, 0x4034000000000000L    # 20.0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-double/2addr v0, v2
a=0;// 
a=0;//     const-wide/high16 v2, 0x4008000000000000L    # 3.0
a=0;// 
a=0;//     add-double/2addr v0, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     double-to-int v1, v0
a=0;// 
a=0;//     .line 57
a=0;//     #v1=(Integer);
a=0;//     const-string v0, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 58
a=0;//     #v2=(Reference,[C);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     .line 59
a=0;//     #v3=(Integer);
a=0;//     new-instance v4, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 60
a=0;//     #v4=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     invoke-static {}, Ljava/lang/Math;->random()D
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     int-to-double v7, v3
a=0;// 
a=0;//     #v7=(DoubleLo);v8=(DoubleHi);
a=0;//     mul-double/2addr v5, v7
a=0;// 
a=0;//     double-to-int v5, v5
a=0;// 
a=0;//     .line 62
a=0;//     #v5=(Integer);
a=0;//     aget-char v5, v2, v5
a=0;// 
a=0;//     #v5=(Char);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 60
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 66
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthMap;->authMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public set(Lcom/tencent/connect/auth/AuthMap$Auth;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthMap;->getSerial()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 42
a=0;//     :try_start_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthMap;->authMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 46
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 43
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 44
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}

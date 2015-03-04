package com.tencent.a.b; class a { void a() { int a;
a=0;// .class public final Lcom/tencent/a/b/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/a/b/a$1;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/tencent/a/b/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/a/b/a;->a:Lcom/tencent/a/b/a;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/a/b/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/a/b/a;Ljava/lang/String;)I
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-static {v3}, Lcom/tencent/a/b/i;->a(C)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v1, v3
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     shl-int/lit8 v0, v2, 0x7
a=0;// 
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     xor-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a()Lcom/tencent/a/b/a;
a=0;//     .locals 2
a=0;// 
a=0;//     const-class v1, Lcom/tencent/a/b/a;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/a/b/a;->a:Lcom/tencent/a/b/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/a/b/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/a/b/a;);
a=0;//     invoke-direct {v0}, Lcom/tencent/a/b/a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/a;);
a=0;//     sput-object v0, Lcom/tencent/a/b/a;->a:Lcom/tencent/a/b/a;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/a/b/a;->a:Lcom/tencent/a/b/a;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 8
a=0;// 
a=0;//     const/16 v7, 0x1b
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1}, Lcom/tencent/a/b/i;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-static {p2}, Lcom/tencent/a/b/i;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/a/b/a$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/a/b/a$1;);
a=0;//     invoke-direct {v2, p0, v0}, Lcom/tencent/a/b/a$1;-><init>(Lcom/tencent/a/b/a;B)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/a/b/a$1;);
a=0;//     invoke-virtual {v2, p1, p2}, Lcom/tencent/a/b/a$1;->a(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v3, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Integer);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v2, v7, :cond_2
a=0;// 
a=0;//     shr-int/lit8 v4, v3, 0x8
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/lit16 v4, v4, 0xff
a=0;// 
a=0;//     sget-object v5, Lcom/tencent/a/b/i;->b:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Char);
a=0;//     invoke-static {v6}, Lcom/tencent/a/b/i;->a(C)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     xor-int/2addr v3, v6
a=0;// 
a=0;//     and-int/lit16 v3, v3, 0xff
a=0;// 
a=0;//     aget v3, v5, v3
a=0;// 
a=0;//     xor-int/2addr v3, v4
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     and-int/lit8 v2, v3, 0x1f
a=0;// 
a=0;//     invoke-virtual {p2, v7}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     sget-object v5, Lcom/tencent/a/b/i;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     if-eq v4, v2, :cond_3
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Boolean);v4=(Conflicted);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);v2=(Char);v4=(Char);
a=0;//     shr-int/lit8 v2, v3, 0x5
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/lit8 v2, v2, 0x1f
a=0;// 
a=0;//     const/16 v3, 0x1c
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     sget-object v4, Lcom/tencent/a/b/i;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     if-eq v3, v2, :cond_4
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Char);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_2
a=0;// .end method
}}

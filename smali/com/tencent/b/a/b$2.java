package com.tencent.b.a; class b$2 { void a() { int a;
a=0;// .class Lcom/tencent/b/a/b$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/FileFilter;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/b/a/b;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/b/a/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/b/a/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     iput-object p1, p0, Lcom/tencent/b/a/b$2;->a:Lcom/tencent/b/a/b;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/b/a/b$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public accept(Ljava/io/File;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 139
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 142
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/tencent/b/a/b$2;->a:Lcom/tencent/b/a/b;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/b/a/b;);
a=0;//     invoke-virtual {v2}, Lcom/tencent/b/a/b;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 144
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 152
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 150
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Lcom/tencent/b/a/b;->d(Ljava/io/File;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}

package com.tencent.b.c; class a { void a() { int a;
a=0;// .class public Lcom/tencent/b/c/a;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/io/File;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 79
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 82
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 84
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 92
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 96
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 100
a=0;//     #v1=(Reference,[Ljava/io/File;);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v2, :cond_3
a=0;// 
a=0;//     aget-object v3, v1, v0
a=0;// 
a=0;//     .line 102
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Lcom/tencent/b/c/a;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     .line 100
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 105
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}

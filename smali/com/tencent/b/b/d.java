package com.tencent.b.b; class d { void a() { int a;
a=0;// .class public Lcom/tencent/b/b/d;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/io/File;
a=0;// 
a=0;// .field private b:J
a=0;// 
a=0;// .field private c:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/b/b/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/io/File;)Lcom/tencent/b/b/d;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     new-instance v0, Lcom/tencent/b/b/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/b/b/d;);
a=0;//     invoke-direct {v0}, Lcom/tencent/b/b/d;-><init>()V
a=0;// 
a=0;//     .line 75
a=0;//     #v0=(Reference,Lcom/tencent/b/b/d;);
a=0;//     invoke-virtual {v0, p0}, Lcom/tencent/b/b/d;->a(Ljava/io/File;)V
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v1, Landroid/os/StatFs;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 79
a=0;//     #v1=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     .line 80
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     .line 81
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v6, v1
a=0;// 
a=0;//     .line 83
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     mul-long/2addr v4, v2
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Lcom/tencent/b/b/d;->a(J)V
a=0;// 
a=0;//     .line 84
a=0;//     mul-long v1, v6, v2
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/b/b/d;->b(J)V
a=0;// 
a=0;//     .line 86
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/tencent/b/b/d;->a:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iput-wide p1, p0, Lcom/tencent/b/b/d;->b:J
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/io/File;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iput-object p1, p0, Lcom/tencent/b/b/d;->a:Ljava/io/File;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-wide v0, p0, Lcom/tencent/b/b/d;->b:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public b(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iput-wide p1, p0, Lcom/tencent/b/b/d;->c:J
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-wide v0, p0, Lcom/tencent/b/b/d;->c:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     const-string v0, "[%s : %d / %d]"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/b/d;->a()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/b/d;->c()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/b/d;->b()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}

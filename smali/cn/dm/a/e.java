package cn.dm.a; class e { void a() { int a;
a=0;// .class public Lcn/dm/a/e;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcn/dm/android/f/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Lcn/dm/a/c/b;
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:Lcn/dm/a/a/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/a/e;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     sput-object v0, Lcn/dm/a/e;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcn/dm/a/a/a;Lcn/dm/a/c/b;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 20
a=0;//     #p0=(Reference,Lcn/dm/a/e;);
a=0;//     const/high16 v0, 0x200000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcn/dm/a/e;->c:I
a=0;// 
a=0;//     .line 24
a=0;//     iput-object p1, p0, Lcn/dm/a/e;->d:Lcn/dm/a/a/a;
a=0;// 
a=0;//     .line 25
a=0;//     iput-object p2, p0, Lcn/dm/a/e;->b:Lcn/dm/a/c/b;
a=0;// 
a=0;//     .line 26
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(JLjava/lang/String;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 36
a=0;//     .line 37
a=0;//     #v0=(Null);
a=0;//     sget v2, Lcn/dm/a/d/a;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     sget-object v1, Lcn/dm/a/e;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v2, "\u4e0b\u8f7d\u5730\u5740\u9519\u8bef\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v1, p0, Lcn/dm/a/e;->b:Lcn/dm/a/c/b;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/a/e;->d:Lcn/dm/a/a/a;
a=0;// 
a=0;//     invoke-interface {v1, v2}, Lcn/dm/a/c/b;->e(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 70
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(One);v2=(Byte);v3=(LongHi);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {}, Lcn/dm/a/d/b;->a()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v0, Landroid/os/StatFs;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 46
a=0;//     #v0=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     .line 48
a=0;//     #v2=(LongLo);
a=0;//     invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v4, v0
a=0;// 
a=0;//     .line 49
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     mul-long/2addr v2, v4
a=0;// 
a=0;//     .line 51
a=0;//     iget v0, p0, Lcn/dm/a/e;->c:I
a=0;// 
a=0;//     int-to-long v4, v0
a=0;// 
a=0;//     add-long/2addr v4, p1
a=0;// 
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 53
a=0;//     invoke-static {p3}, Lcn/dm/a/d/b;->d(Ljava/lang/String;)Z
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 70
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     :cond_1
a=0;//     #v0=(Byte);v2=(LongLo);
a=0;//     sget-object v0, Lcn/dm/a/e;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v2, "\u5b58\u50a8\u7a7a\u95f4\u4e0d\u8db3\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcn/dm/a/e;->d:Lcn/dm/a/a/a;
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Lcn/dm/a/a/a;->c(I)V
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcn/dm/a/e;->d:Lcn/dm/a/a/a;
a=0;// 
a=0;//     const-string v2, "\u5b58\u50a8\u7a7a\u95f4\u4e0d\u8db3\u54e6\uff0c\u8bf7\u6e05\u7406\u5185\u5b58\u540e\u518d\u6765\u5b8c\u6210\u4efb\u52a1\u5427\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lcn/dm/a/a/a;->g(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcn/dm/a/e;->b:Lcn/dm/a/c/b;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/a/e;->d:Lcn/dm/a/a/a;
a=0;// 
a=0;//     invoke-interface {v0, v2}, Lcn/dm/a/c/b;->e(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 64
a=0;//     :cond_2
a=0;//     #v0=(Null);v2=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     sget-object v2, Lcn/dm/a/e;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v3, "\u6ca1\u6709sd\u5361\uff0c\u4e0d\u80fd\u4e0b\u8f7d\uff01"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v2, p0, Lcn/dm/a/e;->d:Lcn/dm/a/a/a;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcn/dm/a/a/a;->c(I)V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v1, p0, Lcn/dm/a/e;->d:Lcn/dm/a/a/a;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/a/a/a;);
a=0;//     const-string v2, "SD\u5361\u51fa\u73b0\u95ee\u9898\uff0c\u8bf7\u68c0\u67e5\u540e\u518d\u6765\u5b8c\u6210\u4efb\u52a1\u5427\uff01"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcn/dm/a/a/a;->g(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v1, p0, Lcn/dm/a/e;->b:Lcn/dm/a/c/b;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/a/e;->d:Lcn/dm/a/a/a;
a=0;// 
a=0;//     invoke-interface {v1, v2}, Lcn/dm/a/c/b;->e(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}

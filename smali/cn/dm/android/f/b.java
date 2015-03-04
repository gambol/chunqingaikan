package cn.dm.android.f; class b { void a() { int a;
a=0;// .class public Lcn/dm/android/f/b;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/f/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcn/dm/a/a/a;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 42
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {p0}, Lcn/dm/a/a/a;->h()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     long-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0}, Lcn/dm/a/a/a;->l()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     long-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     const/high16 v1, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 46
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)Landroid/content/Intent;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 26
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 27
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v2, 0x10000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 28
a=0;//     const-string v2, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 29
a=0;//     invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "application/vnd.android.package-archive"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 31
a=0;//     return-object v1
a=0;// .end method
}}

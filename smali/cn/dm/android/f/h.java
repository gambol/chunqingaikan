package cn.dm.android.f; class h { void a() { int a;
a=0;// .class public Lcn/dm/android/f/h;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/f/h;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;F)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 26
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 87
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 88
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->available()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 89
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 90
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     .line 91
a=0;//     const-string v3, "UTF-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v3}, Lorg/apache/http/util/EncodingUtils;->getString([BLjava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 92
a=0;//     :try_start_1
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 96
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 93
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v4, v0
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move-object v1, v4
a=0;// 
a=0;//     .line 94
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 93
a=0;//     :catch_1
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);v3=(Reference,Ljava/lang/String;);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     #v2=(Null);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 49
a=0;//     invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/Spanned;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 51
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2, v2}, Landroid/widget/Toast;->setGravity(III)V
a=0;// 
a=0;//     .line 52
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 69
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/FileOutputStream;->write([B)V
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 74
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 71
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 72
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;F)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 38
a=0;//     #v0=(Integer);
a=0;//     div-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}

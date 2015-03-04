package net.slidingmenu.tools.b.a.c; class j { void a() { int a;
a=0;// .class Lnet/slidingmenu/tools/b/a/c/j;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static a(Landroid/content/Context;Landroid/webkit/WebSettings;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V
a=0;// 
a=0;//     const-wide v0, 0x7fffffffffffffffL
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/webkit/WebSettings;->setAppCacheMaxSize(J)V
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setAppCachePath(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
}}

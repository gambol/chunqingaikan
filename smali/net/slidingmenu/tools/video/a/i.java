package net.slidingmenu.tools.video.a; class i { void a() { int a;
a=0;// .class Lnet/slidingmenu/tools/video/a/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lnet/slidingmenu/tools/video/a/f;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/video/a/i;->a:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/video/a/i;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/i;->a:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/video/a/f;->c(Lnet/slidingmenu/tools/video/a/f;)Landroid/widget/VideoView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);v1=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/i;->a:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/video/a/f;->d(Lnet/slidingmenu/tools/video/a/f;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/i;->a:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/i;->a:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/video/a/f;->c(Lnet/slidingmenu/tools/video/a/f;)Landroid/widget/VideoView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/VideoView;->getDuration()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lnet/slidingmenu/tools/video/a/f;->b(Lnet/slidingmenu/tools/video/a/f;I)I
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/i;->a:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/video/a/f;->c(Lnet/slidingmenu/tools/video/a/f;)Landroid/widget/VideoView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/VideoView;->getCurrentPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/i;->a:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/video/a/f;->d(Lnet/slidingmenu/tools/video/a/f;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit16 v1, v1, -0x1f4
a=0;// 
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/i;->a:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/video/a/f;->d(Lnet/slidingmenu/tools/video/a/f;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/i;->a:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/video/a/f;->d(Lnet/slidingmenu/tools/video/a/f;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v0, v1, v0
a=0;// 
a=0;//     div-int/lit16 v0, v0, 0x3e8
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/i;->a:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/video/a/f;->e(Lnet/slidingmenu/tools/video/a/f;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/i;->a:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/video/a/f;->a(Lnet/slidingmenu/tools/video/a/f;)Lnet/slidingmenu/tools/video/a/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lnet/slidingmenu/tools/video/a/c;->setTime(I)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/i;->a:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a/f;->a()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
}}

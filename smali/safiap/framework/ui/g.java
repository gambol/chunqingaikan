package safiap.framework.ui; class g { void a() { int a;
a=0;// .class final Lsafiap/framework/ui/g;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lsafiap/framework/ui/res/LayoutDialog$a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic a:Ljava/lang/String;
a=0;// 
a=0;// .field private synthetic b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lsafiap/framework/ui/UpdateHintActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 418
a=0;//     iput-object p1, p0, Lsafiap/framework/ui/g;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     iput-object p2, p0, Lsafiap/framework/ui/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/ui/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 423
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 425
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/g;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     invoke-static {v0}, Lsafiap/framework/ui/UpdateHintActivity;->d(Lsafiap/framework/ui/UpdateHintActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 426
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/g;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/ui/g;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lsafiap/framework/ui/UpdateHintActivity;->d(Lsafiap/framework/ui/UpdateHintActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v0, v1, v2}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 428
a=0;//     invoke-static {}, Lsafiap/framework/ui/UpdateHintActivity;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "IAPFilepath .... url:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 430
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 431
a=0;//     invoke-static {}, Lsafiap/framework/ui/UpdateHintActivity;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v2, "SAFFramework UI file exits ...."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 432
a=0;//     iget-object v1, p0, Lsafiap/framework/ui/g;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/io/File;)V
a=0;// 
a=0;//     .line 436
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/g;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Lsafiap/framework/ui/UpdateHintActivity;)Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->dismiss()V
a=0;// 
a=0;//     .line 437
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/g;->b:Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/UpdateHintActivity;->finish()V
a=0;// 
a=0;//     .line 439
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}

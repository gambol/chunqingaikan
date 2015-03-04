package safiap.framework; class f { void a() { int a;
a=0;// .class final Lsafiap/framework/f;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lsafiap/framework/SafFrameworkManager;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1281
a=0;//     iput-object p1, p0, Lsafiap/framework/f;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onGotUpdateList(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lsafiap/framework/a/b;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1284
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "onGotUpdateList...start"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1285
a=0;//     sget v1, Lsafiap/framework/util/a;->a:I
a=0;// 
a=0;//     .line 1287
a=0;//     #v1=(Integer);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 1288
a=0;//     iget-object v0, p0, Lsafiap/framework/f;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->a(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1289
a=0;//     iget-object v2, p0, Lsafiap/framework/f;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v2}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v0, p2}, Lsafiap/framework/UpdateManager;->pickPluginUpdateItems(Landroid/content/Context;Ljava/util/Map;Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     .line 1291
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lsafiap/framework/a/b;
a=0;// 
a=0;//     .line 1292
a=0;//     iget-object v3, v0, Lsafiap/framework/a/b;->n:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "Timer"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget v3, v0, Lsafiap/framework/a/b;->o:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     iget v3, v0, Lsafiap/framework/a/b;->o:I
a=0;// 
a=0;//     if-ge v3, v1, :cond_1
a=0;// 
a=0;//     .line 1293
a=0;//     iget v0, v0, Lsafiap/framework/a/b;->o:I
a=0;// 
a=0;//     .line 1294
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "change timer frequence:"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1300
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "safiap.framework.ACTION_SET_TIMER"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1301
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v2, Lsafiap/framework/CheckUpdateReceiver;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/f;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-virtual {v3}, Lsafiap/framework/SafFrameworkManager;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1302
a=0;//     sget-object v2, Lsafiap/framework/CheckUpdateReceiver;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1303
a=0;//     iget-object v1, p0, Lsafiap/framework/f;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-virtual {v1, v0}, Lsafiap/framework/SafFrameworkManager;->sendBroadcast(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 1304
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);v3=(Integer);v4=(Reference,Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final onGotUpdateListError(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1309
a=0;//     return-void
a=0;// .end method
}}

package cn.sharesdk.framework.statistics; class NewAppReceiver$b { void a() { int a;
a=0;// .class Lcn/sharesdk/framework/statistics/NewAppReceiver$b;
a=0;// .super Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "b"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Lcn/sharesdk/framework/statistics/NewAppReceiver$a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/statistics/NewAppReceiver$b;);
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;->a:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/statistics/NewAppReceiver$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/statistics/NewAppReceiver$a;);
a=0;//     invoke-direct {v0, p1}, Lcn/sharesdk/framework/statistics/NewAppReceiver$a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/NewAppReceiver$a;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;->b:Lcn/sharesdk/framework/statistics/NewAppReceiver$a;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/HashMap;)Ljava/util/ArrayList;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;)",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
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
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/ArrayList;)Ljava/util/HashMap;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;)",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v1, "pkg"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/statistics/NewAppReceiver$b;);
a=0;//     invoke-direct {v0, p0}, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/NewAppReceiver$b;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;->start()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/b;);
a=0;//     invoke-virtual {v1, v7}, Lcn/sharesdk/framework/utils/b;->a(Z)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;->b:Lcn/sharesdk/framework/statistics/NewAppReceiver$a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/statistics/NewAppReceiver$a;->a()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;->b:Lcn/sharesdk/framework/statistics/NewAppReceiver$a;
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/statistics/NewAppReceiver$a;);
a=0;//     invoke-virtual {v3, v2}, Lcn/sharesdk/framework/statistics/NewAppReceiver$a;->a(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;->a(Ljava/util/ArrayList;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;->a(Ljava/util/ArrayList;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v5=(Reference,Ljava/util/Iterator;);v6=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v6, "pkg"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v6=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v5, "pkg"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v5=(Conflicted);
a=0;//     invoke-direct {p0, v3}, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;->a(Ljava/util/HashMap;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p0, v4}, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;->a(Ljava/util/HashMap;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_4
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "================== upload new adds: "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/utils/b;->r()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     new-array v4, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/sharesdk/framework/statistics/a;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "APPS"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v0}, Lcn/sharesdk/framework/statistics/a;->a(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "================== upload new removes: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/utils/b;->r()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/statistics/a;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "UNINSTALL"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/sharesdk/framework/statistics/a;->a(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v3=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}

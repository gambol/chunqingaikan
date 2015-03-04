package com.twocloooo; class p { void a() { int a;
a=0;// .class Lcom/twocloooo/p;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloooo/DevNativeService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/p;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const-string v0, "android.intent.action.PACKAGE_ADDED"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v2, v0, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getDataString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ":"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aget-object v1, v0, v7
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/twocloooo/DevNativeService;->d()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getDataString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ":"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aget-object v1, v1, v7
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     iget-object v0, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->v()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v4, v0}, Lcom/twocloooo/bg;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloooo/au;
a=0;// 
a=0;//     invoke-static {v4, v1}, Lcom/twocloooo/DevNativeService;->b(Lcom/twocloooo/DevNativeService;Lcom/twocloooo/au;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v4, 0x15
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-lt v1, v4, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-virtual {v1, v0, p1}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/au;Landroid/content/Context;)V
a=0;// 
a=0;//     :goto_3
a=0;//     iget-object v0, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/DevNativeService;->a()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->d(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/LinkedList;);
a=0;//     iget-object v0, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Boolean);v4=(Reference,Ujava/lang/Object;);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Uninit);v4=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloooo/DevNativeService;->c()Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {}, Lcom/twocloooo/DevNativeService;->c()Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloooo/DevNativeService;->c()Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getDataString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ":"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aget-object v2, v2, v7
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {}, Lcom/twocloooo/DevNativeService;->c()Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloooo/DevNativeService;->c()Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;Lcom/twocloooo/au;)V
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {}, Lcom/twocloooo/DevNativeService;->c()Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v2=(Null);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Boolean);v1=(Null);v2=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloooo/ay;
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloooo/ay;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     const-string v4, "stp"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v4}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     const-string v5, "&"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-le v5, v8, :cond_1
a=0;// 
a=0;//     iget-object v5, v0, Lcom/twocloooo/ay;->b:Ljava/lang/Integer;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aget-object v6, v4, v8
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne v5, v6, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/p;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     aget-object v2, v4, v7
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v5, v0, Lcom/twocloooo/ay;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v0, Lcom/twocloooo/ay;->g:Ljava/lang/String;
a=0;// 
a=0;//     aget-object v3, v4, v3
a=0;// 
a=0;//     invoke-static {v1, v2, v5, v0, v3}, Lcom/twocloooo/bg;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
}}

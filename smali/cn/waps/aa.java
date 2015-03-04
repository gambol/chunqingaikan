package cn.waps; class aa { void a() { int a;
a=0;// .class Lcn/waps/aa;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/waps/AppConnect;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcn/waps/AppConnect;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/aa;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/aa;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcn/waps/AppConnect;Lcn/waps/i;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcn/waps/aa;-><init>(Lcn/waps/AppConnect;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/aa;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     iget-object v2, p0, Lcn/waps/aa;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/AppConnect;);
a=0;//     iget-object v2, v2, Lcn/waps/AppConnect;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v1}, Lcn/waps/SDKUtils;->isConnect()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/aa;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/AppConnect;);
a=0;//     sget-object v2, Lcn/waps/AppConnect;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     const-string v3, "U_P"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Lcn/waps/AppConnect;->a(Lcn/waps/AppConnect;Landroid/content/SharedPreferences;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/aa;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     sget-object v3, Lcn/waps/AppConnect;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-static {v2, v1, v3}, Lcn/waps/AppConnect;->a(Lcn/waps/AppConnect;ILandroid/content/SharedPreferences;)Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcn/waps/al;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->t()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lcn/waps/AppConnect;->d:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "&points="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/aa;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/AppConnect;->i(Lcn/waps/AppConnect;)Ljava/lang/String;
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
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->e()Lcn/waps/ag;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1, v2}, Lcn/waps/ag;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aa;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/AppConnect;);
a=0;//     invoke-static {v0, v1}, Lcn/waps/AppConnect;->d(Lcn/waps/AppConnect;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->n()Lcn/waps/UpdatePointsNotifier;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->n()Lcn/waps/UpdatePointsNotifier;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/UpdatePointsNotifier;);
a=0;//     sget-object v0, Lcn/waps/AppConnect;->f:Ljava/util/Map;
a=0;// 
a=0;//     const-string v3, "failed_to_spend_points"
a=0;// 
a=0;//     invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lcn/waps/UpdatePointsNotifier;->getUpdatePointsFailed(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcn/waps/aa;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/AppConnect;);
a=0;//     sget-object v0, Lcn/waps/AppConnect;->f:Ljava/util/Map;
a=0;// 
a=0;//     const-string v3, "failed_to_spend_points"
a=0;// 
a=0;//     invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcn/waps/AppConnect;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/String;);v2=(Boolean);v3=(Reference,Lcn/waps/ag;);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Boolean);v2=(Reference,Landroid/content/Context;);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcn/waps/aa;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/AppConnect;);
a=0;//     const-string v2, "spend"
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/aa;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/AppConnect;);
a=0;//     invoke-static {v3}, Lcn/waps/AppConnect;->i(Lcn/waps/AppConnect;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v2, v3}, Lcn/waps/AppConnect;->a(Lcn/waps/AppConnect;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcn/waps/aa;->a([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// .end method
}}

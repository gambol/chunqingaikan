package cn.waps; class x { void a() { int a;
a=0;// .class Lcn/waps/x;
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
a=0;//     iput-object p1, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/x;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcn/waps/AppConnect;Lcn/waps/i;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcn/waps/x;-><init>(Lcn/waps/AppConnect;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/x;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;//     .locals 12
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     sget-object v0, Lcn/waps/AppConnect;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "GetPointsTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v10, v11}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/waps/AppConnect;->b()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/AppConnect;);
a=0;//     iget-object v0, v0, Lcn/waps/AppConnect;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->getHistoryPoints(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/waps/AppConnect;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->getHistoryPointsName(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v7, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v7=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     iget-object v8, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v8=(Reference,Lcn/waps/AppConnect;);
a=0;//     iget-object v8, v8, Lcn/waps/AppConnect;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v7, v8}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v7=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v7}, Lcn/waps/SDKUtils;->isConnect()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     if-ltz v1, :cond_2
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->n()Lcn/waps/UpdatePointsNotifier;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/UpdatePointsNotifier;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->n()Lcn/waps/UpdatePointsNotifier;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2, v0, v1}, Lcn/waps/UpdatePointsNotifier;->getUpdatePoints(Ljava/lang/String;I)V
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Lcn/waps/AppConnect;->b(Ljava/lang/String;I)V
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Byte);v8=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Null);v3=(LongLo);v4=(LongHi);v5=(LongLo);v7=(Uninit);v8=(Uninit);
a=0;//     move v1, v2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     const-string v7, ""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     cmp-long v7, v3, v10
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     cmp-long v7, v3, v10
a=0;// 
a=0;//     if-eqz v7, :cond_c
a=0;// 
a=0;//     sub-long v3, v5, v3
a=0;// 
a=0;//     const-wide/16 v5, 0x4e20
a=0;// 
a=0;//     cmp-long v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ltz v3, :cond_c
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/AppConnect;);
a=0;//     sget-object v4, Lcn/waps/AppConnect;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v5, "U_P"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v5}, Lcn/waps/AppConnect;->a(Lcn/waps/AppConnect;Landroid/content/SharedPreferences;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v4, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     sget-object v5, Lcn/waps/AppConnect;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-static {v4, v3, v5}, Lcn/waps/AppConnect;->a(Lcn/waps/AppConnect;ILandroid/content/SharedPreferences;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_8
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcn/waps/AppConnect;->d(Lcn/waps/AppConnect;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->n()Lcn/waps/UpdatePointsNotifier;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->n()Lcn/waps/UpdatePointsNotifier;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/UpdatePointsNotifier;);
a=0;//     sget-object v0, Lcn/waps/AppConnect;->f:Ljava/util/Map;
a=0;// 
a=0;//     const-string v3, "failed_to_update_points"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcn/waps/UpdatePointsNotifier;->getUpdatePointsFailed(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/AppConnect;);
a=0;//     sget-object v0, Lcn/waps/AppConnect;->f:Ljava/util/Map;
a=0;// 
a=0;//     const-string v3, "failed_to_update_points"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/waps/AppConnect;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v2=(Null);v3=(Integer);v4=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->e()Lcn/waps/ag;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/ag;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcn/waps/al;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->s()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget-object v5, Lcn/waps/AppConnect;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Lcn/waps/ag;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     invoke-virtual {v3}, Ljava/lang/NumberFormatException;->printStackTrace()V
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->e()Lcn/waps/ag;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcn/waps/al;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->s()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget-object v5, Lcn/waps/AppConnect;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Lcn/waps/ag;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v4=(Boolean);
a=0;//     iget-object v3, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcn/waps/AppConnect;->b()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     if-ltz v1, :cond_4
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->n()Lcn/waps/UpdatePointsNotifier;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/UpdatePointsNotifier;);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->n()Lcn/waps/UpdatePointsNotifier;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2, v0, v1}, Lcn/waps/UpdatePointsNotifier;->getUpdatePoints(Ljava/lang/String;I)V
a=0;// 
a=0;//     :cond_9
a=0;//     iget-object v2, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Lcn/waps/AppConnect;->b(Ljava/lang/String;I)V
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_a
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->n()Lcn/waps/UpdatePointsNotifier;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->n()Lcn/waps/UpdatePointsNotifier;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/UpdatePointsNotifier;);
a=0;//     sget-object v0, Lcn/waps/AppConnect;->f:Ljava/util/Map;
a=0;// 
a=0;//     const-string v3, "failed_to_update_points"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcn/waps/UpdatePointsNotifier;->getUpdatePointsFailed(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_b
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/AppConnect;);
a=0;//     sget-object v0, Lcn/waps/AppConnect;->f:Ljava/util/Map;
a=0;// 
a=0;//     const-string v3, "failed_to_update_points"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/waps/AppConnect;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_c
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(LongHi);v5=(LongLo);
a=0;//     iget-object v3, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/AppConnect;);
a=0;//     invoke-virtual {v3}, Lcn/waps/AppConnect;->b()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_e
a=0;// 
a=0;//     if-ltz v1, :cond_e
a=0;// 
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->n()Lcn/waps/UpdatePointsNotifier;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/UpdatePointsNotifier;);
a=0;//     if-eqz v2, :cond_d
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/AppConnect;->n()Lcn/waps/UpdatePointsNotifier;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2, v0, v1}, Lcn/waps/UpdatePointsNotifier;->getUpdatePoints(Ljava/lang/String;I)V
a=0;// 
a=0;//     :cond_d
a=0;//     iget-object v2, p0, Lcn/waps/x;->a:Lcn/waps/AppConnect;
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Lcn/waps/AppConnect;->b(Ljava/lang/String;I)V
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_e
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcn/waps/x;->a([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// .end method
}}

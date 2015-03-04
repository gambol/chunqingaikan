package cn.waps; class bc { void a() { int a;
a=0;// .class Lcn/waps/bc;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic b:Ljava/util/List;
a=0;// 
a=0;// .field final synthetic c:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic d:Z
a=0;// 
a=0;// .field final synthetic e:Landroid/widget/CheckBox;
a=0;// 
a=0;// .field final synthetic f:Landroid/app/Dialog;
a=0;// 
a=0;// .field final synthetic g:Lcn/waps/ay;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/ay;Landroid/content/Context;Ljava/util/List;Ljava/lang/String;ZLandroid/widget/CheckBox;Landroid/app/Dialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/bc;->g:Lcn/waps/ay;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/bc;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/bc;->b:Ljava/util/List;
a=0;// 
a=0;//     iput-object p4, p0, Lcn/waps/bc;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-boolean p5, p0, Lcn/waps/bc;->d:Z
a=0;// 
a=0;//     iput-object p6, p0, Lcn/waps/bc;->e:Landroid/widget/CheckBox;
a=0;// 
a=0;//     iput-object p7, p0, Lcn/waps/bc;->f:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/bc;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 6
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/bc;->g:Lcn/waps/ay;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ay;);
a=0;//     iget-object v1, p0, Lcn/waps/bc;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcn/waps/bc;->b:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     iget-object v4, p0, Lcn/waps/bc;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v5, p0, Lcn/waps/bc;->d:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static/range {v0 .. v5}, Lcn/waps/ay;->a(Lcn/waps/ay;Landroid/content/Context;Ljava/util/List;ILjava/lang/String;Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/bc;->e:Landroid/widget/CheckBox;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/bc;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "AppSettings"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v0, "pref_fun_cache_time"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v1, v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v2, "pref_fun_default_packageName"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcn/waps/bc;->b:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/waps/AdInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->getAdPackage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/bc;->f:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/bc;->f:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}

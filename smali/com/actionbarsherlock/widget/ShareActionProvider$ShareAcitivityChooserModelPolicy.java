package com.actionbarsherlock.widget; class ShareActionProvider$ShareAcitivityChooserModelPolicy { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ShareActionProvider.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/widget/ShareActionProvider;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ShareAcitivityChooserModelPolicy"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/widget/ShareActionProvider;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/actionbarsherlock/widget/ShareActionProvider;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;->this$0:Lcom/actionbarsherlock/widget/ShareActionProvider;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/actionbarsherlock/widget/ShareActionProvider;Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;-><init>(Lcom/actionbarsherlock/widget/ShareActionProvider;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onChooseActivity(Lcom/actionbarsherlock/widget/ActivityChooserModel;Landroid/content/Intent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     .param p2, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;->this$0:Lcom/actionbarsherlock/widget/ShareActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/widget/ShareActionProvider;->access$2(Lcom/actionbarsherlock/widget/ShareActionProvider;)Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;->this$0:Lcom/actionbarsherlock/widget/ShareActionProvider;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/widget/ShareActionProvider;->access$2(Lcom/actionbarsherlock/widget/ShareActionProvider;)Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 311
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;->this$0:Lcom/actionbarsherlock/widget/ShareActionProvider;
a=0;// 
a=0;//     .line 310
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider;);
a=0;//     invoke-interface {v0, v1, p2}, Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;->onShareTargetSelected(Lcom/actionbarsherlock/widget/ShareActionProvider;Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 313
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}

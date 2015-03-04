package com.actionbarsherlock.widget; class ShareActionProvider$ShareMenuItemOnMenuItemClickListener { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ShareActionProvider.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/widget/ShareActionProvider;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ShareMenuItemOnMenuItemClickListener"
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
a=0;//     .line 274
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;->this$0:Lcom/actionbarsherlock/widget/ShareActionProvider;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/actionbarsherlock/widget/ShareActionProvider;Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;-><init>(Lcom/actionbarsherlock/widget/ShareActionProvider;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onMenuItemClick(Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;//     .locals 5
a=0;//     .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;->this$0:Lcom/actionbarsherlock/widget/ShareActionProvider;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider;);
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/widget/ShareActionProvider;->access$0(Lcom/actionbarsherlock/widget/ShareActionProvider;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;->this$0:Lcom/actionbarsherlock/widget/ShareActionProvider;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider;);
a=0;//     invoke-static {v4}, Lcom/actionbarsherlock/widget/ShareActionProvider;->access$1(Lcom/actionbarsherlock/widget/ShareActionProvider;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 277
a=0;//     invoke-static {v3, v4}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 279
a=0;//     .local v0, "dataModel":Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     invoke-interface {p1}, Lcom/actionbarsherlock/view/MenuItem;->getItemId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 280
a=0;//     .local v1, "itemId":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->chooseActivity(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 281
a=0;//     .local v2, "launchIntent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 282
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;->this$0:Lcom/actionbarsherlock/widget/ShareActionProvider;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/widget/ShareActionProvider;->access$0(Lcom/actionbarsherlock/widget/ShareActionProvider;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 284
a=0;//     :cond_0
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     return v3
a=0;// .end method
}}

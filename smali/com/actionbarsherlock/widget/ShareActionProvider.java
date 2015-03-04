package com.actionbarsherlock.widget; class ShareActionProvider { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/widget/ShareActionProvider;
a=0;// .super Lcom/actionbarsherlock/view/ActionProvider;
a=0;// .source "ShareActionProvider.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;,
a=0;//         Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;,
a=0;//         Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_INITIAL_ACTIVITY_COUNT:I = 0x4
a=0;// 
a=0;// .field public static final DEFAULT_SHARE_HISTORY_FILE_NAME:Ljava/lang/String; = "share_history.xml"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mMaxShownActivityCount:I
a=0;// 
a=0;// .field private mOnChooseActivityListener:Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;// .field private final mOnMenuItemClickListener:Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
a=0;// 
a=0;// .field private mOnShareTargetSelectedListener:Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;// .field private mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/view/ActionProvider;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 105
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider;);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mMaxShownActivityCount:I
a=0;// 
a=0;//     .line 111
a=0;//     new-instance v0, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;-><init>(Lcom/actionbarsherlock/widget/ShareActionProvider;Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mOnMenuItemClickListener:Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
a=0;// 
a=0;//     .line 126
a=0;//     const-string v0, "share_history.xml"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     .line 139
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 140
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/widget/ShareActionProvider;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/actionbarsherlock/widget/ShareActionProvider;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/actionbarsherlock/widget/ShareActionProvider;)Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mOnShareTargetSelectedListener:Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private setActivityChooserPolicyIfNeeded()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 293
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mOnShareTargetSelectedListener:Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 301
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 296
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mOnChooseActivityListener:Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 297
a=0;//     new-instance v1, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;-><init>(Lcom/actionbarsherlock/widget/ShareActionProvider;Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/ShareActionProvider$ShareAcitivityChooserModelPolicy;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mOnChooseActivityListener:Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     .line 299
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 300
a=0;//     .local v0, "dataModel":Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mOnChooseActivityListener:Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->setOnChooseActivityListener(Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public hasSubMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateActionView()Landroid/view/View;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 164
a=0;//     .local v1, "dataModel":Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     new-instance v0, Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v4}, Lcom/actionbarsherlock/widget/ActivityChooserView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 165
a=0;//     .local v0, "activityChooserView":Lcom/actionbarsherlock/widget/ActivityChooserView;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserView;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/widget/ActivityChooserView;->setActivityChooserModel(Lcom/actionbarsherlock/widget/ActivityChooserModel;)V
a=0;// 
a=0;//     .line 168
a=0;//     new-instance v3, Landroid/util/TypedValue;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 169
a=0;//     .local v3, "outTypedValue":Landroid/util/TypedValue;
a=0;//     #v3=(Reference,Landroid/util/TypedValue;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/actionbarsherlock/R$attr;->actionModeShareDrawable:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v4, v5, v3, v6}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, v3, Landroid/util/TypedValue;->resourceId:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 171
a=0;//     .local v2, "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, v2}, Lcom/actionbarsherlock/widget/ActivityChooserView;->setExpandActivityOverflowButtonDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {v0, p0}, Lcom/actionbarsherlock/widget/ActivityChooserView;->setProvider(Lcom/actionbarsherlock/view/ActionProvider;)V
a=0;// 
a=0;//     .line 176
a=0;//     sget v4, Lcom/actionbarsherlock/R$string;->abs__shareactionprovider_share_with_application:I
a=0;// 
a=0;//     .line 175
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v4}, Lcom/actionbarsherlock/widget/ActivityChooserView;->setDefaultActionButtonContentDescription(I)V
a=0;// 
a=0;//     .line 178
a=0;//     sget v4, Lcom/actionbarsherlock/R$string;->abs__shareactionprovider_share_with:I
a=0;// 
a=0;//     .line 177
a=0;//     invoke-virtual {v0, v4}, Lcom/actionbarsherlock/widget/ActivityChooserView;->setExpandActivityOverflowButtonContentDescription(I)V
a=0;// 
a=0;//     .line 180
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPrepareSubMenu(Lcom/actionbarsherlock/view/SubMenu;)V
a=0;//     .locals 10
a=0;//     .param p1, "subMenu"    # Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 197
a=0;//     #v9=(Null);
a=0;//     invoke-interface {p1}, Lcom/actionbarsherlock/view/SubMenu;->clear()V
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v8}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 200
a=0;//     .local v2, "dataModel":Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 202
a=0;//     .local v6, "packageManager":Landroid/content/pm/PackageManager;
a=0;//     #v6=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->getActivityCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 203
a=0;//     .local v3, "expandedActivityCount":I
a=0;//     #v3=(Integer);
a=0;//     iget v7, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mMaxShownActivityCount:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 206
a=0;//     .local v1, "collapsedActivityCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v5=(Integer);v7=(Conflicted);
a=0;//     if-lt v5, v1, :cond_1
a=0;// 
a=0;//     .line 213
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     sget v8, Lcom/actionbarsherlock/R$string;->abs__activity_chooser_view_see_all:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 215
a=0;//     invoke-interface {p1, v9, v1, v1, v7}, Lcom/actionbarsherlock/view/SubMenu;->addSubMenu(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 218
a=0;//     .local v4, "expandedSubMenu":Lcom/actionbarsherlock/view/SubMenu;
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/view/SubMenu;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v8=(Conflicted);
a=0;//     if-lt v5, v3, :cond_2
a=0;// 
a=0;//     .line 225
a=0;//     .end local v4    # "expandedSubMenu":Lcom/actionbarsherlock/view/SubMenu;
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 207
a=0;//     :cond_1
a=0;//     #v4=(Uninit);v8=(Reference,Ujava/lang/Object;);
a=0;//     invoke-virtual {v2, v5}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->getActivity(I)Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 208
a=0;//     .local v0, "activity":Landroid/content/pm/ResolveInfo;
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     invoke-virtual {v0, v6}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-interface {p1, v9, v5, v5, v7}, Lcom/actionbarsherlock/view/SubMenu;->add(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 209
a=0;//     invoke-virtual {v0, v6}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-interface {v7, v8}, Lcom/actionbarsherlock/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mOnMenuItemClickListener:Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
a=0;// 
a=0;//     invoke-interface {v7, v8}, Lcom/actionbarsherlock/view/MenuItem;->setOnMenuItemClickListener(Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .line 206
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 219
a=0;//     .end local v0    # "activity":Landroid/content/pm/ResolveInfo;
a=0;//     .restart local v4    # "expandedSubMenu":Lcom/actionbarsherlock/view/SubMenu;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v4=(Reference,Lcom/actionbarsherlock/view/SubMenu;);v8=(Conflicted);
a=0;//     invoke-virtual {v2, v5}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->getActivity(I)Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 220
a=0;//     .restart local v0    # "activity":Landroid/content/pm/ResolveInfo;
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     invoke-virtual {v0, v6}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-interface {v4, v9, v5, v5, v7}, Lcom/actionbarsherlock/view/SubMenu;->add(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {v0, v6}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-interface {v7, v8}, Lcom/actionbarsherlock/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mOnMenuItemClickListener:Lcom/actionbarsherlock/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
a=0;// 
a=0;//     invoke-interface {v7, v8}, Lcom/actionbarsherlock/view/MenuItem;->setOnMenuItemClickListener(Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .line 218
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setOnShareTargetSelectedListener(Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mOnShareTargetSelectedListener:Lcom/actionbarsherlock/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;//     .line 154
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/ShareActionProvider;->setActivityChooserPolicyIfNeeded()V
a=0;// 
a=0;//     .line 155
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShareHistoryFileName(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "shareHistoryFile"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     .line 243
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/ShareActionProvider;->setActivityChooserPolicyIfNeeded()V
a=0;// 
a=0;//     .line 244
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShareIntent(Landroid/content/Intent;)V
a=0;//     .locals 3
a=0;//     .param p1, "shareIntent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 267
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     .line 266
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 268
a=0;//     .local v0, "dataModel":Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->setIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 269
a=0;//     return-void
a=0;// .end method
}}

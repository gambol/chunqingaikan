package com.actionbarsherlock.widget; class ActivityChooserModel$DefaultSorter { void a() { int a;
a=0;// .class final Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActivityChooserModel.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x12
a=0;//     name = "DefaultSorter"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final WEIGHT_DECAY_COEFFICIENT:F = 0.95f
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mPackageNameToActivityMap:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/actionbarsherlock/widget/ActivityChooserModel;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 885
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 889
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;->mPackageNameToActivityMap:Ljava/util/Map;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/actionbarsherlock/widget/ActivityChooserModel;Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 885
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;-><init>(Lcom/actionbarsherlock/widget/ActivityChooserModel;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public sort(Landroid/content/Intent;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 10
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Intent;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 894
a=0;//     .local p2, "activities":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;>;"
a=0;//     .local p3, "historicalRecords":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;->mPackageNameToActivityMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 895
a=0;//     .local v7, "packageNameToActivityMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;>;"
a=0;//     #v7=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v7}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     .line 897
a=0;//     invoke-interface {p2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 898
a=0;//     .local v1, "activityCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Integer);v6=(Conflicted);v8=(Conflicted);
a=0;//     if-lt v3, v1, :cond_0
a=0;// 
a=0;//     .line 905
a=0;//     invoke-interface {p3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     add-int/lit8 v4, v8, -0x1
a=0;// 
a=0;//     .line 906
a=0;//     .local v4, "lastShareIndex":I
a=0;//     #v4=(Integer);
a=0;//     const/high16 v5, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 907
a=0;//     .local v5, "nextRecordWeight":F
a=0;//     #v5=(Integer);
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-gez v3, :cond_1
a=0;// 
a=0;//     .line 917
a=0;//     invoke-static {p2}, Ljava/util/Collections;->sort(Ljava/util/List;)V
a=0;// 
a=0;//     .line 924
a=0;//     return-void
a=0;// 
a=0;//     .line 899
a=0;//     .end local v4    # "lastShareIndex":I
a=0;//     .end local v5    # "nextRecordWeight":F
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v4=(Uninit);v5=(Uninit);v9=(Uninit);
a=0;//     invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     .line 900
a=0;//     .local v0, "activity":Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     iput v8, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F
a=0;// 
a=0;//     .line 901
a=0;//     iget-object v8, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     iget-object v8, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v6, v8, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 902
a=0;//     .local v6, "packageName":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 898
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 908
a=0;//     .end local v0    # "activity":Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     .end local v6    # "packageName":Ljava/lang/String;
a=0;//     .restart local v4    # "lastShareIndex":I
a=0;//     .restart local v5    # "nextRecordWeight":F
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Integer);v5=(Integer);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     .line 909
a=0;//     .local v2, "historicalRecord":Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     iget-object v8, v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v8}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 910
a=0;//     .restart local v6    # "packageName":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     .line 911
a=0;//     .restart local v0    # "activity":Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 912
a=0;//     iget v8, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     iget v9, v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;->weight:F
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     mul-float/2addr v9, v5
a=0;// 
a=0;//     #v9=(Float);
a=0;//     add-float/2addr v8, v9
a=0;// 
a=0;//     #v8=(Float);
a=0;//     iput v8, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F
a=0;// 
a=0;//     .line 913
a=0;//     const v8, 0x3f733333    # 0.95f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     mul-float/2addr v5, v8
a=0;// 
a=0;//     .line 907
a=0;//     :cond_2
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
